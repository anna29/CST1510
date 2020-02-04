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
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author Anna29
 */
public class TilePaneExample extends Application{

    @Override
    public void start(Stage primaryStage){
        
         TilePane tile = new TilePane();
         
         Button top = new Button("Top");
         Button left = new Button("Left");
         Button center = new Button("Center");
         
            tile.setPadding(new Insets(10, 10, 10, 10));
            tile.setPrefColumns(2);
            tile.setStyle("-fx-background-color: #CD5C5C;");
            HBox hbox2 = new HBox(8); // spacing = 8
            hbox2.getChildren().addAll(top, left, center);
            tile.getChildren().add(hbox2);

        Scene s = new Scene(tile, 200,250);
        primaryStage.setTitle("Tile Pane");
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    } 
}
