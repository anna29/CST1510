/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week16_lecture;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Anna29
 */
public class EnterEvent extends Application{

     @Override
    public void start(Stage primaryStage){
                GridPane pane = new GridPane();
                
                Label l = new Label();
                l.setText("Enter a valu and press enter");
                TextField tf = new TextField();
                
                
                pane.add(l, 0, 0);
		pane.add(tf, 1, 0);
     
                EventHandler<KeyEvent> event = new EventHandler<KeyEvent>(){

                    public void handle(KeyEvent event) {
                        if (event.getCode()== KeyCode.ENTER){
                            System.out.println("hello");
                        }
                    }
                    
                };
                
                tf.setOnKeyPressed(event);

                Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("EnterEvent"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage     
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

   
    
}
