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
		
		Button delBtn = new Button("Delete");
		delBtn.setOnAction(e -> GameLibraryController.deleteVGItems());
		
		Button exitBtn = new Button("Exit"); 
		exitBtn.setOnAction(e -> GameLibraryController.closeVGProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, delBtn, exitBtn);
		
		return bar;
	}

	public static HBox BGbuttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		addBtn.setOnAction(e -> GameLibraryController.addBGItems());

		Button delBtn = new Button("Delete");
		delBtn.setOnAction(e -> GameLibraryController.deleteBGItems());

		Button exitBtn = new Button("Exit");
		exitBtn.setOnAction(e -> GameLibraryController.closeBGProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, delBtn, exitBtn);

		return bar;
	}

	public static HBox CGbuttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		addBtn.setOnAction(e -> GameLibraryController.addCGItems());

		Button delBtn = new Button("Delete");
		delBtn.setOnAction(e -> GameLibraryController.deleteCGItems());

		Button exitBtn = new Button("Exit");
		exitBtn.setOnAction(e -> GameLibraryController.closeCGProgram());
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, delBtn, exitBtn);

		return bar;
	}

}
