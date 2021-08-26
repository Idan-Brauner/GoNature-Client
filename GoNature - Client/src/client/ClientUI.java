package client;

import javafx.application.Application;
import javafx.stage.Stage;
import gui.MainLogInController;
import gui.SystemLogInController;
import gui.VisitorMenuController;

public class ClientUI extends Application {
	public static ClientConsole chat;

	public static void main(String args[]) throws Exception {
		launch(args);
	} // end main

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 chat= new ClientConsole("localhost", 5555);
		SystemLogInController eFrame = new SystemLogInController(); //create new Visitordata
		eFrame.start(primaryStage);
	}
}
