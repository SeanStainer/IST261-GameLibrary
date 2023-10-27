package View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CloseConfirmation 
{
	static boolean result;
	
	public static boolean show(String title, String message)
	{
		//create a stage for the alert
		Stage window = new Stage();
		
		//set title that comes from main
		window.setTitle(title);
		
		//set window size
		window.setMinHeight(200);
		window.setMinWidth(500);
		
		//makes the top window have to be interacted with before moving to different windows
		//must close the alert before doing anything else
		window.initModality(Modality.APPLICATION_MODAL);
		
		//DO NOT USE SWING LABEL
		Label label = new Label(message);
		
		//create first button
		Button b1 = new Button("Yes");
		b1.setOnAction(e -> {
								result = true;
								window.close();
							});
		
		//create second button
		Button b2 = new Button("No");
		b2.setOnAction(e -> {
								result = false;
							});
		
		//vertical box - add items to layout
		VBox layout = new VBox(10);
		
		// .addAll displays everything
		layout.getChildren().addAll(label, b1, b2);
		layout.setAlignment(Pos.CENTER);
		
		//display window and wait for button to close it
		//add the layout to the scene
		Scene scene = new Scene(layout);
		window.setScene(scene);
		//show vs showAndWait
		window.showAndWait();
		
		return result;
	}

}
