/*This code demonstrate how to create a basic flowPane containing buttons and  lables configured with horizontal and vertical gaps*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.layout.FlowPane;
import javafx.stage.stage;
import javafx.shape.*;

public class FlowPaneAssignment extends Application {
	@Override
	public void start(Stage stage) {
			//Initialize with gaps and padding
	
		FlowPane flowPane = new FlowPane();		
		flowPane.setPadding(new Insets(10));
		flowPane.setHgap(10);
		flowPane.setVgap(10);
		
		for (int i = 1; i<= 10; i++) {
			flowPane.getChildern().add(new Button("Button " + i));
		}
		
		primaryStage.setScene(new Scene(flowPane, 300, 200));
		primaryStage.setTitle("FlowPane Assignment");
		primaryStage.show();
	}
	public static void main(String[] args) {launch(args);
	}
}

