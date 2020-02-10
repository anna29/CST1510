package week16_lecture;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * *
 * The class used for purpose of JavaFX project is extended with Application
 * class Application class provides number of useful methods The method that is
 * used in this project is a start method This method is called when the main
 * method calls the launch method of the Application class.
 */
public class Week16 extends Application {

    /**
     * *
     * The start method is used to start the application, and create the logic
     * and look of the application.
     *
     * @param primaryStage is a top-level container which hosts Scene and all
     * the visual elements that are attached to it.
     */
    @Override
    public void start(Stage primaryStage) {
        /*
        TextFields is one of the nodes available in JavaFx,
        it is used for purpose of receiving a text input from the users.
         */
        TextField firstNameTextField = new TextField();
        /*
        setPromptText is used for purpose of setting up a hint for a user
        so they do understand the purpose of the field
        */
        firstNameTextField.setPromptText("First Name");
        TextField surnameTextField = new TextField();
        surnameTextField.setPromptText("Surname");
        /*
        Button is another node available in JavaFX, it is used for purpose
        of performing actions
         */
        Button submitButton = new Button();
        submitButton.setText("Greetings");
        
        Label firstNameLabel = new Label("First name: ");
        Label surnameLabel = new Label("Surname: ");
        /*
        setOnAction is a method used for purpose of creating 
        an action hanlder used for handling an action that user has performed
        */
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nameConfirmAlert(firstNameTextField.getText(),
                        surnameTextField.getText());
            }
        });
        /*
        setOnKeyPressed is used for purpose of handling a specific keyboard button
        press on the textField in this case an return button
        */
        firstNameTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    nameConfirmAlert(firstNameTextField.getText(),
                            surnameTextField.getText());
                }
            }
        });
        surnameTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    nameConfirmAlert(firstNameTextField.getText(),
                            surnameTextField.getText());
                }
            }
        });
        /*
        GrindPane is one of the layouts available in JavaFX
        It is used for purpose of organiasing the nodes in tabular form
        */
        GridPane root = new GridPane();
        /*
        Padding is used for setting how much space is 
        added from each side of the screen
        */
        root.setPadding(new Insets(50, 50, 50, 50));
        /*
        GridPane.setConstraints is used for setting the location of the grid
        to which the node is going to be place on
        */
        GridPane.setConstraints(firstNameLabel, 0, 0);
        GridPane.setConstraints(firstNameTextField, 1, 0);
        GridPane.setConstraints(surnameLabel, 0, 1);
        GridPane.setConstraints(surnameTextField, 1, 1);
        GridPane.setConstraints(submitButton, 1, 2);
        /*
        The nodes have to be added to pane by either using addAll or add method
        the addAll method will add all the nodes in the order they were written
        and the add method will only add a single node
        */
        root.getChildren().addAll(surnameLabel,firstNameLabel,submitButton, firstNameTextField,
                surnameTextField);
        /*
        Scene is used for purpose of handling all the nodes 
        */
        Scene scene = new Scene(root, 300, 250);
        
        /*
        The primary stage is the window that is used for handling the user interaction.
        The stage can include different set of parameters such as disabling the 
        ability to resize the window.
        */
        primaryStage.setTitle("JavaFX Introduction");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void nameConfirmAlert(String firstName, String surname) {
        /*
        An alert is a pop-up box that can be used to display information to the user
        */
        Alert alert = new Alert(AlertType.CONFIRMATION, "Hello, is you name? "
                + firstName + " " + surname,
                ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            replyConfirmation("Amazing!");
        } else if (alert.getResult() == ButtonType.NO) {
            replyConfirmation("Whoops sorry! Try again =(");
        } else if (alert.getResult() == ButtonType.CANCEL) {
            replyConfirmation("ohh ok, bye then.");
        }
    }

    public void replyConfirmation(String message) {
        Alert alertCancelReply = new Alert(AlertType.INFORMATION, message);
        alertCancelReply.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
