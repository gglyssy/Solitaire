package application;

import javafx.fxml.FXML;

import java.util.HashMap;

import javafx.event.ActionEvent;

import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.event.Event;

public class MainController extends SuperController {
    @FXML
    private BorderPane mainPane;
	@FXML
	private MenuItem newGameMenuItem;
	@FXML
	private MenuItem saveMenuItem;
	@FXML
	private MenuItem saveAsMenuItem;
	@FXML
	private MenuItem openMenuItem;
	@FXML
	private MenuItem preferencesMenuItem;
	@FXML
	private MenuItem exitMenuItem;
	@FXML
	private MenuItem undoMenuItem;
	@FXML
	private MenuItem redoMenuItem;
	@FXML
	private MenuItem restartMenuitem;
	@FXML
	private MenuItem hintMenuItem;
	@FXML
	private MenuItem howToPlayMenuItem;
	@FXML
	private MenuItem aboutMenuItem;

	// Event Listener on MenuItem[#newGameMenuItem].onAction
	@FXML
	public void startNewGame(ActionEvent event) {
		System.out.println("Starting a new game");
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#saveMenuItem].onAction
	@FXML
	public void saveEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#saveAsMenuItem].onAction
	@FXML
	public void saveAsEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#openMenuItem].onAction
	@FXML
	public void openGameEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#preferencesMenuItem].onAction
	@FXML
	public void openPreferencesEventHandler(ActionEvent event) {
		System.out.println("Opening preferences menu");
		//Get the main pane and set the center to be the settings screen
		mainPane.setCenter((GridPane) this.getAppPaneMap().get("settingsScreen"));
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#exitMenuItem].onAction
	@FXML
	public void exitGameEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#undoMenuItem].onAction
	@FXML
	public void undoEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#undoMenuItem].onMenuValidation
	@FXML
	public void undoEventHandlerShortcut(Event event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#redoMenuItem].onAction
	@FXML
	public void redoEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#redoMenuItem].onMenuValidation
	@FXML
	public void redoEventHandlerShortcut(Event event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#restartMenuitem].onAction
	@FXML
	public void restartEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#restartMenuitem].onMenuValidation
	@FXML
	public void restartEventHandlerShortcut(Event event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#hintMenuItem].onAction
	@FXML
	public void hintRequestEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#hintMenuItem].onMenuValidation
	@FXML
	public void hintRequestEventHandlerShortcut(Event event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#howToPlayMenuItem].onAction
	@FXML
	public void howToPlayEventHandler(ActionEvent event) {
		System.out.println("Showing how to play");
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#aboutMenuItem].onAction
	@FXML
	public void aboutEventHandler(ActionEvent event) {
		// TODO Autogenerated
	}
}
