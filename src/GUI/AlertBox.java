package GUI;
//Package Declaration and Imports for JavaFX Libraries

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//Alert Box class for errors
public class AlertBox {
    //Method for displaying an alertbox with a specific name and message
    public static void display(String title, String message) {
        //new window that cannot be ignored
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); //keeps the focus on this window
        window.setTitle(title);
        window.setMinWidth(50);
        window.setMinHeight(50);
        //Obtains the message and saves it
        Label label = new Label();
        label.setText(message);
        //loads error image and places it
        Image error = new Image("Images/Pokemon/16.1.gif");
        ImageView iv = new ImageView();
        iv.setImage(error);
        //Button for closing the window
        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> window.close());
        //Layout for error window
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, closeButton,iv);
        layout1.setAlignment(Pos.CENTER);
        //sets up the window so that it is constantly looking for an event
        Scene scene = new Scene(layout1, 200, 400);
        window.setScene(scene);
        window.showAndWait();
    }
}
