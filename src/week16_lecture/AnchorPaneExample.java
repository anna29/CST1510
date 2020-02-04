/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week16_lecture;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Anna29
 */
public class AnchorPaneExample  extends Application{

    @Override
    public void start(Stage primaryStage){
        
        
         AnchorPane anchorpane = new AnchorPane();
            Button buttonSave = new Button("Save");
            Button buttonCancel = new Button("Cancel");
            anchorpane.setStyle("-fx-background-color: #A9A9A9;");
            HBox hb = new HBox();
            hb.getChildren().addAll(buttonSave, buttonCancel);
            anchorpane.getChildren().addAll(hb);
            anchorpane.setMinSize(300, 100);
            AnchorPane.setRightAnchor(hb, 10.0);
        
        Scene s = new Scene(anchorpane, 200,250);
        primaryStage.setTitle("Anchor Pane");
        primaryStage.setScene(s);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    } 
    
}
