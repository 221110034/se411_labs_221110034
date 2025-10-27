package application;


import application.ui.ProductUI;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class App extends Application {
	
	Stage window;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
		@Override
		public void start(Stage primaryStage) { // Stage is the same as document/window in HTML
	
			try {	
				
				window = primaryStage;
				primaryStage.setTitle("Tasks Manager 07 TableView");
				
				M
				
				BorderPane layout = new BorderPane();
				layout.setTop();
				
				window.setScene(scene);
				
				ProductUI pdui = new ProductUI();
				
				Scene scene = new Scene(pdui.getProductsUI(), 640, 400);
				window.setScene(scene);
				window.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
