 package view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import edu.westga.cs1302.javafx_sample.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

public class MainWindow extends Application {
	
	
	public static final String WINDOW_TITLE = "Sample JavaFX Project";
	
	public void start(Stage primaryStage) throws IOException {
		
		Parent parent = FXMLLoader.load(getClass().getResource(Main.GUI_RESOURCE));
		Scene scene = new Scene(parent);
		 primaryStage.setTitle(WINDOW_TITLE);
		 primaryStage.setScene(scene);
		 
		
		Label label = new Label("Pantry");
		
		TextField textField = new TextField();
		
		primaryStage.showAndWait();
	}

}
