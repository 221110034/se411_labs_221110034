package application.ui;

import javafx.scene.control.Menu;

public class MainMenuUI {
	
	public MenuBar getMainMenu(BoderPane layout) {
	Menu fileMenu = new Menu("File");
	
	MenuItem productsMenu = new MenuItem
	fileMenu.getItems().add(new MenuItem("New Project..."));
	fileMenu.getItems().add(new MenuItem("New File..."));
	fileMenu.getItems().add(new MenuItem("Import Project..."));
	fileMenu.getItems().add(new SeparatorMenuItem());
	fileMenu.getItems().add(new MenuItem("Save"));
	fileMenu.getItems().add(new SeparatorMenuItem());
	fileMenu.getItems().add(new MenuItem("Exit"));
	
	MenuBar menuBar = new MenuBar();
	menuBar.getMenus().addAll(fileMenu, editMenu);
	layout = new BorderPane();
	layout.setTop(menuBar);
	Scene scene = new Scene(layout, 640, 400);
	window.setScene(scene);
	window.show();
	}
}
