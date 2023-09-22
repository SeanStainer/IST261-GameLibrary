module IST261_GameLibraryMain 
{
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
	opens View to javafx.graphics, javafx.fml;
	opens Model to javafx.graphics, javafx.fml;
	opens Controller to javafx.graphics, javafx.fml;
}
