package CH20;

import java.awt.*;

public class MultipleBounceBall extends Application {
    public void start (Stage primaryStage) {
        MultipleBallPane ballPane = new MultipleBallPane(); // creates a ball pane
        ballPane.setStyle("-fx-border-color: yellow"); // set ball pane border

        // Creates buttons
        Button btAdd    = new Button("+");
        Button btSubtract = new Button("-");

        // Adds buttons to HBox
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        // Add or remove a ball



    }
}
