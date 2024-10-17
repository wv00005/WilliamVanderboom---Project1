package edu.westga.cs1302.bill.model;

import java.util.Comparator;

/**
 * arranges the billAmounts from lowest to highest
 * 
 * @author William Vanderboom
 * @version Fall 2024
 * 
 */

public class BillAscendingBillComparator implements Comparator<BillItem> {

	@Override
	public int compare(BillItem o1, BillItem o2) {
		if (o1.getAmount() < o2.getAmount()) {
			return -1;
		} else if (o1.getAmount() > o2.getAmount()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
	@Override
	public String toString() {
		return "Ascending";
	}

}
