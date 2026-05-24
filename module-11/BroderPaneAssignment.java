/*This program demonstrate broderPane places UI controls in all five regions of 
the BroderPane layout using JavaFx. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.layout.BroderPane;
import javafxstage.stage;

public class BroderPaneAssignment extends Application {

	@Overrride
	public void start(Stage primaryStage) {
		// 1. Create the BorderPane layout
		BroderPane broderPane = new BroderPane();
		
		//2. Create nodes (lables) for all 5 regions
		Label topLabel = new Label("Top Region: Menu Bar");
		Label leftLabel = new Label("Left Region: Navigation");
		Label centerLabel = new Label("Center Region: Main Content");
		Label rightLabel = new Label("Right Region: Details");
		Label bottomLabel = new Label("Bottom Region:Status Bar");
		
		// 3. Add nodes to the BroderPane
		broderPane.setTop(topLabel);
		broderPane.setTLeft(leftLabel);
		broderPane.setCenter(centerLabel);
		broderPane.setRight(rightLabel);
		broderPane.setBottom(bottomLabel);
		
		// Set up the scene and stage
		Scene scene = new Scene(broderPane ,600, 400);
		primaryStage.setTitle("BroderPane Assignment");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

