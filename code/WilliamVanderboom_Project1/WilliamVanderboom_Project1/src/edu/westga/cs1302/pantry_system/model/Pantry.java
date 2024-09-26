package edu.westga.cs1302.pantry_system.model;

import java.util.ArrayList;

/**
 * stores the pantryList arraylist
 * 
 * @author wv00005
 * @version Fall 2024
 */
public class Pantry {

	private ArrayList<Food> pantryList;

	/**
	 * initializes this.pantryList
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public Pantry() {
		this.pantryList = new ArrayList<Food>();
	}

	/**
	 * adds the given Food object to pantryList
	 * 
	 * @precondition type and name cannot be null or empty type has to be from the
	 *               ComboBox foodTypes
	 * @postcondition none
	 * 
	 * @param food Food type objected passed from pantryList
	 * @throws IllegalArgumentException
	 */
	public void addFood(Food food) throws IllegalArgumentException {
		if (food == null) {
			throw new IllegalArgumentException("Food cannot be null");
		}
		this.pantryList.add(food);
	}

	/**
	 * removes the given Food object from pantrList
	 * 
	 * @param food type Food entered from pantryList
	 * @throws IllegalArgumentException
	 */
	public void removeFood(Food food) throws IllegalArgumentException {
		if (food == null) {
			throw new IllegalArgumentException("Food cannot be null");
		}
		this.pantryList.remove(food);
	}

	/**
	 * gets this.pantryList
	 * 
	 * @return this.pantryList
	 */
	public ArrayList<Food> getPantry() {
		return this.pantryList;
	}

}
