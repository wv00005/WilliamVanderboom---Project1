package edu.westga.cs1302.bill.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
			if (bill != null) {
				writer.write(bill.getServerName() + System.lineSeparator());
			} else {
				throw new IllegalArgumentException("Bill cannot be null");
			}
			BillItem[] billItems = bill.getItems();
			writer.write(BillCalculator.getSubTotal(billItems) + "," + BillCalculator.getTax(billItems) + "," + BillCalculator.getTip(billItems) + (",") + BillCalculator.getTotal(billItems) + System.lineSeparator());
			
			for (BillItem currBill : billItems) {
				writer.write(currBill.getName() + "," + currBill.getAmount() + System.lineSeparator());
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
	 * @throws IOException 
	 */
	public static Bill loadBillData() throws IOException {
		//List<BillItem> billData = new ArrayList<BillItem>();
		File inputFile = new File(DATA_FILE);
		Bill loadBill = new Bill();
		try (Scanner reader = new Scanner(inputFile)) {
			String serverName = reader.nextLine().strip();
			//String[] balance = reader.nextLine().strip().split(",");
			//double subTotal = Double.parseDouble(balance[0]);
			//double tax = Double.parseDouble(balance[1]);
			//double tip = Double.parseDouble(balance[2]);
			//double total = Double.parseDouble(balance[3]);
			
			for (int lineNumber = 3; reader.hasNextLine(); lineNumber++) {
				String baseLine = reader.nextLine();
				String strippedLine = baseLine.strip();
				String[] parts = strippedLine.split(",");
				try {
					String name = parts[0];
					double amount = Double.parseDouble(parts[1]);
					BillItem theBill = new BillItem(name, amount);
					loadBill.addItem(theBill);
				} catch (NumberFormatException numError) {
					throw new IOException(
							"Unable to read amount (was not a valid double) on line " + lineNumber + " : " + strippedLine);
				} catch (IllegalArgumentException billDataError) {
					throw new IOException(
							"Unable to create Biem, bad name/amount on line " + lineNumber + " : " + strippedLine);
				} catch (IndexOutOfBoundsException billDataError) {
					throw new IOException(
							"Missing either name and/or amount on line " + lineNumber + " : " + strippedLine);
				}
			loadBill.setServerName(serverName);
			
			}
		}
		return loadBill;
	}

}
