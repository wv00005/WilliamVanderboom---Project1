package edu.westga.cs1302.javafx_sample;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import view.MainWindow;

public class Main extends Application {
	
	/**
	* Entry point for the program
	*
	* @author CS1302
	* @version Fall 2024
	* 
	 * @throws IOException 
	*/
	@Override
	public void start(Stage primaryStage) throws IOException {
		MainWindow mainWindow = new MainWindow();
		mainWindow.start(primaryStage);
		
	}
	
	//public static final String WINDOW_TITLE = "Sample JavaFX Project";
	public static final String GUI_RESOURCE = "view/MainWindow.fxml";
	
	
	/**
	 * JavaFX entry point.
	 * 
	 * @precondition none
	 * @postcondition none 
	 * 
	 * @param args command line arguments
	 */

	public static void main(String[] args) {
		Main.launch(args);

	}

}
