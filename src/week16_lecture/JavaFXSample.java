
package week16_lecture;



import java.awt.event.KeyEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSample extends Application{

    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button ("ok");       
        FlowPane root = new FlowPane();
        Scene scene = new Scene (root,250,200);     
 
        Label l1 = new Label();
        l1.setText("Enter your name");
        
        TextField t1 = new TextField();
        
        Label l2 = new Label();
        l2.setText("Select your gender");
        CheckBox checkBoxM = new CheckBox("male");
        CheckBox checkBoxF = new CheckBox("female");
        
        root.getChildren().addAll(l1, t1, l2,checkBoxM, checkBoxF, btOK);
        
// action event 
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                
                String s = t1.getText();
                if (checkBoxM.isSelected()){
                     System.out.println(" "+ s+" you are a gentleman");
                }else if (checkBoxF.isSelected()){
                    System.out.println(" "+ s+" you are a lady");
                }
  
            } 
        }; 
        
        
        
        btOK.setOnAction(event1);
      
        
        primaryStage.setTitle("my 1st JavaFX ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }  
    
}
