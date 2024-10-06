package edu.westga.cs1302.bill.model;

import java.io.FileWriter;
import java.io.IOException;

/** Supports saving and loading bill data,
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class BillPersistenceManager {
	
	public static final String DATA_FILE = "data.txt";
	
	/** Save the bill!
	 * 
	 * Writes all bill data to DATA_FILE
	 * 
	 * 
	 * @precondition bill != null
	 * @postcondition none
	 * 
	 * @param bill the bill to save
	 * @throws IOException 
	 */
	public static void saveBillData(Bill bill) throws IOException {
		try (FileWriter writer = new FileWriter(DATA_FILE)) {
			writer.write(bill.getServerName() + ",");
			BillItem[] billItems = bill.getItems();
			for (BillItem currBill : billItems) {
				writer.write(currBill.getName() + "," + currBill.getAmount() + BillCalculator.getSubTotal(billItems) + "," + BillCalculator.getTax(billItems) + "," + BillCalculator.getTip(billItems) + (",") + BillCalculator.getTotal(billItems) + System.lineSeparator());
			}
		}
	}

	/** Load the bill!
	 * 
	 * Reads from DATA_FILE
	 * File is assumed to use the same format as saveBillData
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the bill loaded
	 */
	public static Bill loadBillData() {
		return null;
	}

}
