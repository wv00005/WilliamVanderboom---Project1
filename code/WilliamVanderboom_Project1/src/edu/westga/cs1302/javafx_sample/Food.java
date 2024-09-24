package edu.westga.cs1302.javafx_sample;

public class Food {
	
	private final String name;
	
	private final String type;
	
	private final int quantity;
	
	/**
	 * initializes name, type, and quantity
	 * 
	 * @param name
	 * @param type
	 * 
	 * @precondition name, quantity, and type are defined
	 * @postcondition name = this.name; type = this.type; quantity = 0\
	 *  
	 */
	public Food(String name, String type) {
		
		quantity = 0;
		
		this.name = name;
		this.type = type;
		
		
	}
	
	/**
	 * gets the type of Food
	 * 
	 * @preconditon none
	 * @postcondition none
	 * 
	 * @return this.type
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * gets the name of Food
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return this.name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * gets the quantity of Food
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the number of Food
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * concatenates the name and quantity using getName and getQuantity
	 * 
	 * @precondition getName and getQuantity are initialized
	 * @postcondition none
	 * 
	 * @return a string value of the name and quantity
	 */
	public String toString() {
		
		return getName() + ": " + Integer.toString(getQuantity());
	}

}
