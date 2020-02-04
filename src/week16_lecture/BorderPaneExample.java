/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week16_lecture;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Anna29
 */
public class BorderPaneExample extends Application{

    @Override
    public void start(Stage primaryStage) {
        
         BorderPane pane = new BorderPane();
         Button b1 = new Button("Left");
         Button b2 = new Button("Center");
         Button b3 = new Button("Right");
         Button b4 = new Button("Top");
         Button b5 = new Button("Bottom");
            pane.setLeft(b1);
            pane.setCenter(b2);
            pane.setRight(b3);
            pane.setTop(b4);
            pane.setBottom(b5);
 
        Scene scene = new Scene(pane, 300, 250);
        

        primaryStage.setTitle("Anchor Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    public static void main(String[] args) {
        launch(args);
    } 
    
}
