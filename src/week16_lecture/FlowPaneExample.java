/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week16_lecture;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Anna29
 */
public class FlowPaneExample extends Application{

    @Override
    public void start(Stage primaryStage){
         FlowPane flow = new FlowPane();
         Button left = new Button("Left");
         Button center = new Button("Center");
        
         flow.setPadding(new Insets(10, 10, 10, 10));
        flow.setStyle("-fx-background-color: DAE6F3;");
        flow.setHgap(5);
        flow.getChildren().addAll(left, center);
        
        Scene s = new Scene(flow, 200,250);
        primaryStage.setTitle("FlowPane");
        primaryStage.setScene(s);
        primaryStage.show();  
    }
    public static void main(String[] args) {
        launch(args);
    } 
}
