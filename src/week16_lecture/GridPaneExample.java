/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week16_lecture;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anna29
 */
public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
         GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10));
grid.setMinSize(300, 300);
grid.setVgap(5);
grid.setHgap(5);
 
Text username = new Text("Username:");
grid.add(username, 0, 0);
 
TextField text = new TextField();
text.setPrefColumnCount(10);
grid.add(text, 1, 0);
 
Text password = new Text("Password:");
grid.add(password, 0, 1);
 
TextField text2 = new TextField();
text2.setPrefColumnCount(10);
grid.add(text2, 1, 1);
grid.setStyle("-fx-background-color: #D8BFD8;");
        
        Scene s = new Scene(grid, 200,250);
        primaryStage.setTitle("GridPanel");
        primaryStage.setScene(s);
        primaryStage.show();
  
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
