
import javafx.scene.control.Button;

import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.*;

public class TextField2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		
	    primaryStage.setTitle("Welcome Page");
		

	    TextField txt =  new TextField();
	    PasswordField txt1 = new PasswordField();
	    Label lbl = new Label("Name: ");
	    Label lbl1 = new Label("Password: ");
		Button btn = new Button("Submit");
		btn.setPrefSize(80, 30);
	    
	    GridPane root1 = new GridPane();
	    
	    root1.addRow(0,lbl,txt);
	    root1.addRow(1,lbl1,txt1);
	    root1.addRow(2,btn);
	  
	    root1.setAlignment(Pos.CENTER);
		
	    root1.setColumnSpan(btn,2);
	    root1.setHalignment(btn,HPos.CENTER);	
	    
	    Scene scene = new Scene(root1, 800,600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

