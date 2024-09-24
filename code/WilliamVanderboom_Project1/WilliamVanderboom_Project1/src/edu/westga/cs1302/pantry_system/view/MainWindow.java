 package edu.westga.cs1302.pantry_system.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import edu.westga.cs1302.pantry_system.Main;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;

public class MainWindow extends Application {
	
	
	public static final String WINDOW_TITLE = "Sample JavaFX Project";
	
	public ObservableList<String> pantry;
	public ObservableList<String> foodTypes;
	
	/**
	 * 
	 */
	public void start(Stage primaryStage){
		
		  ListView<String> listView = new ListView(pantry);
		  
		  TextField textField = new TextField();
		  
		  ComboBox<String> types = new ComboBox();
		  foodTypes.addAll("");
		  
		  
		  
		  
		
	}
}
