package View;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class DevelopersView 
{
	
	public static VBox DeveloperInfo()
	{	
		
		/*
		 * Create an HBox that stores the 
		 * Label and Text Field for the job title of developer
		 * 
		 * Set Constraints(column, row) - sets position of item
		 * 
		 * */
		HBox developerJobTitle = new HBox();
		
		Label jobTitleLabel = new Label("Job Title:  ");
		TextField jobTitle = new TextField("Programmer");
		
		/*
		 * Add items to HBox 
		 * */
		developerJobTitle.setSpacing(20);
		developerJobTitle.getChildren().addAll(jobTitleLabel, jobTitle);
		
		/*
		 * Create an HBox that stores the
		 * Label and Text Field for the first name of developer
		 * 
		 * Set Constraints(column, row) - sets position of item
		 * 
		 * */
		HBox developerFirstName = new HBox();
		
		Label firstNameLabel = new Label("First Name: ");
		TextField firstName = new TextField("John");
		
		/*
		 * Add items to HBox 
		 * */
		developerFirstName.setSpacing(10);
		developerFirstName.getChildren().addAll(firstNameLabel, firstName);
		

		
		/*
		 * Create an HBox that stores the
		 * Label and Text Field for the last name of developer
		 * 
		 * Set Constraints(column, row) - sets position of item
		 * 
		 * */
		HBox developerlastName = new HBox();
		
		Label lastNameLabel = new Label("Last Name: ");
		TextField lastName = new TextField("Smith");
		
		/*
		 * Add items to HBox 
		 * */
		developerlastName.setSpacing(10);
		developerlastName.getChildren().addAll(lastNameLabel, lastName);
		

		
		VBox developerInfo = new VBox();
		developerInfo.setPadding(new Insets(10,10,10,10));
		developerInfo.setSpacing(10);
		developerInfo.getChildren().addAll(developerJobTitle, developerFirstName, developerlastName);
		
		return developerInfo;
	}
	
}
