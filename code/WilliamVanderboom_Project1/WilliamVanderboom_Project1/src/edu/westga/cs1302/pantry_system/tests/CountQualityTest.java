package edu.westga.cs1302.pantry_system.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.pantry_system.model.Food;
import edu.westga.cs1302.pantry_system.model.Pantry;

/**
 * Tests the countQuality method
 * 
 * @author wv00005
 * @version Fall 2024
 */
public class CountQualityTest {
	
	private Pantry pantry;
	
	/**
	 * test countQuantiy with one Food
	 */
	@Test
    public void testCountQuantityOneFood() {
		Food food = new Food("Apple", "Fruit");
		this.pantry = new Pantry();
        this.pantry.addFood(food);
        food.setQuantity(5);
        
        assertEquals(5, Food.countQuantity());
    }
	
    /**
	 * tests countQuantity with multiple Foods
	 */
    @Test
    public void testCountQuantityMultipleFoods() {
    	Food food1 = new Food("Apple", "Fruit");
        this.pantry.addFood(food1);
        food1.setQuantity(1);
    	
        Food food2 = new Food("Apple", "Fruit");
        this.pantry.addFood(food2);
        food2.setQuantity(4);
    	
        Food food3 = new Food("Apple", "Fruit");
        this.pantry.addFood(food3);
        food3.setQuantity(7);
    	
        this.pantry.addFood(food1);
        this.pantry.addFood(food2);
        this.pantry.addFood(food3);
        assertEquals(12, Food.countQuantity());
    }

}
