package edu.westga.cs1302.bill.test.model.BillPersistenceDataMannager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillItem;
import edu.westga.cs1302.bill.model.BillPersistenceManager;



public class TestSaveBillPersistenceManager {

	@Test
	void testNullBill(){
		assertThrows(IllegalArgumentException.class, ()->{BillPersistenceManager.saveBillData(null);});
	}
	
	@Test
	void testNoBill() throws IOException {
		Bill bill = new Bill();
		BillPersistenceManager.saveBillData(bill);
		
		File inputFile = new File(BillPersistenceManager.DATA_FILE);
		try (Scanner reader = new Scanner(inputFile)) {
			assertEquals(reader.nextLine(), "No Server Set");
			assertEquals(reader.nextLine(), "0.0,0.0,0.0,0.0");
			assertFalse(reader.hasNextLine());
		}
	}
	
	@Test
	void testOneBillItem() throws IOException {
		Bill bill = new Bill();
		BillItem billItem = new BillItem("chris",5.25);
		bill.setServerName("Bob");
		bill.addItem(billItem);
		BillPersistenceManager.saveBillData(bill);
		
		File inputFile = new File(BillPersistenceManager.DATA_FILE);
		try (Scanner reader = new Scanner(inputFile)){
			assertEquals("Bob",reader.nextLine());
			assertEquals("chris,5.25",reader.nextLine());
			assertEquals("5.25,0.525,1.05,6.825",reader.nextLine());
			assertFalse(reader.hasNextLine());
		}
				
	}
	
	@Test
	void testMultipleBillItems() throws IOException {
		Bill bill = new Bill();
		BillItem billItem1 = new BillItem("chris",5.00);
		BillItem billItem2 = new BillItem("john",10.00);
		BillItem billItem3 = new BillItem("evan",8.00);
		bill.setServerName("Bob");
		bill.addItem(billItem1);
		bill.addItem(billItem2);
		bill.addItem(billItem3);
		BillPersistenceManager.saveBillData(bill);
		
		File inputFile = new File(BillPersistenceManager.DATA_FILE);
		try (Scanner reader = new Scanner(inputFile)){
			assertEquals("Bob",reader.nextLine());
			assertEquals("chris,5.0",reader.nextLine());
			assertEquals("john,10.0",reader.nextLine());
			assertEquals("evan,8.0",reader.nextLine());
			assertEquals("23.0,2.3,4.6,29.9",reader.nextLine());
			assertFalse(reader.hasNextLine());
		}
				
	}
	
	
}
