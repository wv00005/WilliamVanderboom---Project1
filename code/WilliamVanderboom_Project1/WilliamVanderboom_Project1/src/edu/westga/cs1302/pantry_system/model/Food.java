package edu.westga.cs1302.pantry_system.model;

//import edu.westga.cs1302.pantry_system.model.Pantry;

public class Food {
	
	private static Pantry pantry;
	
	private final String name;
	
	private final String type;
	
	public int quantity;
	
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
		return this.quantity;
	}
	
	/**
	 * sets the quantity of Food to the input
	 * 
	 * @precondition this.quantity must be initialized
	 * @postcondition none
	 * 
	 * @param quantity
	 */
	public void setQuantity(int num) {
		this.quantity = num;
		
	}
	/**
	 * increments quantity by one
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void plusQuantity() {
		this.quantity++;
	}
	
	/**
	 * decrements the quantity
	 * 
	 * precondition none
	 * postcondition none
	 */
	public void minusQuantity() {
		this.quantity--;
	}
	
	public static int countQuantity() {
		int total = 0;
		for (Food currentFood : pantry.getPantry()) {
			total+=currentFood.getQuantity();
		}
		return total;
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
		
		return this.getName() + "-" + Integer.toString(getQuantity());
	}

}
