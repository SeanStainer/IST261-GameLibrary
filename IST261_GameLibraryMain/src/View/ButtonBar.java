package View;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonBar 
{
	public static HBox buttonBar()
	{
		//Button
		Button addBtn = new Button("Add");
		//addBtn.setOnAction(e -> addItems());
		
		Button clearBtn = new Button("Clear");
		//delBtn.setOnAction(e -> deleteItems());
		
		//HBox
		HBox bar = new HBox();
		bar.setPadding(new Insets(10,10,10,10));
		bar.setSpacing(10);
		bar.getChildren().addAll(addBtn, clearBtn);
		
		return bar;
	}

}
