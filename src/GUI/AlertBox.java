package GUI;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); //keeps the focus on this window
        window.setTitle(title);
        window.setMinWidth(50);
        window.setMinHeight(50);

        Label label = new Label();
        label.setText(message);
        Image error = new Image("Images/Pokemon/16.1.gif");
        ImageView iv = new ImageView();
        iv.setImage(error);
        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> window.close());

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, closeButton,iv);
        layout1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout1, 200, 400);
        window.setScene(scene);
        window.showAndWait();
    }
}
