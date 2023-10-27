package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ButtonBar 
{

	public static HBox buttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		//addBtn.setOnAction(e -> addItems());
		
		Button clearBtn = new Button("Clear");
		//delBtn.setOnAction(e -> deleteItems());
		
		Button exitBtn = new Button("Exit"); 
		exitBtn.setOnAction(e -> closeProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, clearBtn, exitBtn);
		
		return bar;
	}
	
	public static void closeProgram() 
	{
		Boolean ans = CloseConfirmation.show("Welcome", "Are you sure you want to close?");
		
		//if answer is true close the window
		if(ans == true)
		{
			System.exit(0);
			System.out.println("Exited interface");
		}
		
	}
	
}
