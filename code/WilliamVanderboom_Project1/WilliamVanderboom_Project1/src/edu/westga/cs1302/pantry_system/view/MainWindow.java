package edu.westga.cs1302.pantry_system.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.westga.cs1302.pantry_system.model.Food;
import edu.westga.cs1302.pantry_system.model.Pantry;
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
	private ListView<Food> pantryListView;

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

	private Pantry pantry;

	@FXML
	private void handleAddButtonClick() {
		String foodName = entry.getText();
		String foodType = foodTypes.getValue();
		Food food = new Food(foodName, foodType);
		
		this.pantry.addFood(food);
		this.pantryListView.getItems().add(food);

		pantryListView.refresh();
	}

	@FXML
	private void handleEntryButtonClick() {
		int num = Integer.parseInt(numberEntry.getText());
		Food food = pantryListView.getSelectionModel().getSelectedItem();

		for (Food currentItem : this.pantry.getPantry()) {
			if (currentItem == food) {
				currentItem.setQuantity(num);
			}
		}

		this.pantryListView.getItems().setAll(this.pantry.getPantry());

		pantryListView.refresh();
	}

	@FXML
	void initialize() {
		assert entry != null : "fx:id=\"entry\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert foodTypes != null : "fx:id=\"foodTypes\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert pantryListView != null : "fx:id=\"pantry\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert addButton != null : "fx:id=\"theButton\" was not injected: check your FXML file 'MainWindow.fxml'.";

		foodTypes.setItems(
				FXCollections.observableArrayList("Vegetable", "Meat", "Bread", "Fruit", "Dessert", "Ingredient"));

		this.pantry = new Pantry();

	}

	/**
	 * method for the plusButton that calls plusQuantity
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void plusButton() {
		Food food = pantryListView.getSelectionModel().getSelectedItem();

		for (Food currentItem : this.pantry.getPantry()) {
			if (currentItem == food) {
				currentItem.plusQuantity();
			}
		}

		this.pantryListView.getItems().setAll(this.pantry.getPantry());
		this.pantryListView.refresh();
	}

	/**
	 * method for the minus button that calls the minusQuantity
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void minusButton() {

		Food food = pantryListView.getSelectionModel().getSelectedItem();

		for (Food currentItem : this.pantry.getPantry()) {
			if (currentItem == food) {
				currentItem.minusQuantity();
			}
		}

		this.pantryListView.getItems().setAll(this.pantry.getPantry());
		this.pantryListView.refresh();
	}



}
