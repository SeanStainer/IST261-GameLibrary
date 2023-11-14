package View;

import Controller.GameLibraryController;
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

	public static HBox VGbuttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		addBtn.setOnAction(e -> GameLibraryController.addVGItems());
		
		Button clearBtn = new Button("Clear");
		//delBtn.setOnAction(e -> GameLibraryController.deleteItems());
		
		Button exitBtn = new Button("Exit"); 
		exitBtn.setOnAction(e -> GameLibraryController.closeProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, clearBtn, exitBtn);
		
		return bar;
	}

	public static HBox BGbuttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		addBtn.setOnAction(e -> GameLibraryController.addVGItems());

		Button clearBtn = new Button("Clear");
		//delBtn.setOnAction(e -> GameLibraryController.deleteItems());

		Button exitBtn = new Button("Exit");
		exitBtn.setOnAction(e -> GameLibraryController.closeProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, clearBtn, exitBtn);

		return bar;
	}

	public static HBox CGbuttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		addBtn.setOnAction(e -> GameLibraryController.addVGItems());

		Button clearBtn = new Button("Clear");
		//delBtn.setOnAction(e -> GameLibraryController.deleteItems());

		Button exitBtn = new Button("Exit");
		exitBtn.setOnAction(e -> GameLibraryController.closeProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, clearBtn, exitBtn);

		return bar;
	}

}
