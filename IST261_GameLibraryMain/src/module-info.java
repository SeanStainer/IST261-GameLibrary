module IST261_GameLibraryMain 
{
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
    requires org.junit.jupiter.api;

    opens application to javafx.graphics, javafx.fxml;
	opens Tests to javafx.graphics, javafx.fxml;
	opens View to javafx.graphics, javafx.fxml;
	opens Model to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
	exports Model;
	exports View;
}
