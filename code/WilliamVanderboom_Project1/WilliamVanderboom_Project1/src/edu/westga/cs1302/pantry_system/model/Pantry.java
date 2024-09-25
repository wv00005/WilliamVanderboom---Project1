package edu.westga.cs1302.pantry_system.model;

import java.util.ArrayList;

public class Pantry {

	public ArrayList<Food> pantryList;
	
	
	public Pantry() {
		this.pantryList = new ArrayList<Food>();
	}
	

	/**
	 * adds the given Food name and type to the pantryList
	 * 
	 * @precondition type and name cannot be null or empty type has to be from the
	 *               ComboBox foodTypes
	 * @postcondition none
	 * 
	 * 
	 */
	public void addFood(Food food) throws IllegalArgumentException {
		if (food == null) {
			throw new IllegalArgumentException("Food cannot be null");
		}
		pantryList.add(food);
	}
	
	public ArrayList<Food> getPantry(){
		return this.pantryList;
	}

}
