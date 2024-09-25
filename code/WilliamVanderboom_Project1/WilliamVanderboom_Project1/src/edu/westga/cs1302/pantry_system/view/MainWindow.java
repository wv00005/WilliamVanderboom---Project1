package edu.westga.cs1302.pantry_system.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.westga.cs1302.pantry_system.model.Food;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> foodTypes;
    
    @FXML
    private ListView<Food> pantry;
    
    @FXML
    private TextField entry;
    
    @FXML
    private Button addButton;
    
    @FXML
    private Button enterButton;
    
    @FXML
    private Button minusButton;
    
    @FXML
    private Button plusButton;
    
    @FXML
    private TextField numberEntry;
    
    @FXML
    private void handleButtonClick() {
    	addButton(entry.getText(),foodTypes.getTypeSelector());
    	
    	pantry.setItems(FXCollections.observableArrayList(list));
    	pantry.refresh();
    }
    
    private static ObservableList<Food> list = FXCollections.observableArrayList();
 

    @FXML
    void initialize() {
    	assert entry != null : "fx:id=\"entry\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert foodTypes != null : "fx:id=\"foodTypes\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert pantry != null : "fx:id=\"pantry\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert addButton != null : "fx:id=\"theButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        
        foodTypes.setItems(FXCollections.observableArrayList("Vegetable", "Meat", "Bread", "Fruit", "Dessert","Ingredient"));
        pantry.setItems(FXCollections.observableArrayList(list));
        
        
            
        
        }
    /**
     * adds the given Food name and type to the ListView pantry
     * 
     * @precondition type and name cannot be null or empty
     * type has to be from the ComboBox foodTypes
     * @postcondition none
     * 
     * 
     */
    public static void addButton(String name,String type) throws IllegalArgumentException {
    	if (name == null) {
    		throw new IllegalArgumentException("Name cannot be null");
    	}
    	if (name == "") {
    		throw new IllegalArgumentException("Name cannot be empty");
    	}
    	
    	Food food = new Food(name,type);
    	
    	
    	list.add(food);
    		
    	
    }
    
    
    
    
    

}
