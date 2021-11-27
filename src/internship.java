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

public class internship extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		
		primaryStage.setTitle("Welcome Page");
		
	
//		Scene scene1 = new Scene(btn, 200,100);
		
	    TextField txt =  new TextField();
	    PasswordField txt1 = new PasswordField();
	    Label lbl = new Label("Name: ");
	    Label lbl1 = new Label("Password: ");
		Button btn = new Button("Submit");
		btn.setPrefSize(80, 30);
	    
	  //  StackPane s = new StackPane();
	    //s.getChildren().addAll(btn);
//	    Group root = new Group(btn);
	    GridPane root1 = new GridPane();
	    
	    root1.addRow(0, lbl,txt);
	    root1.addRow(1, lbl1,txt1);
	    root1.addRow(2, btn);
	  //  btn.setHalignment(,HPos.CENTER);
	    root1.setAlignment(Pos.CENTER);
	    
	    Scene scene = new Scene(root1, 800,600);
		primaryStage.setScene(scene);
//		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}
