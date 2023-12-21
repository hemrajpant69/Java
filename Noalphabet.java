import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Noalphabet extends Application {
    int count = 0;

    @Override
    public void start(Stage s) throws Exception {

        TextField t = new TextField();
        t.setEditable(false);

        HBox root = new HBox();
        root.getChildren().addAll(t);

        Scene scene = new Scene(root, 200, 200);

        scene.setOnKeyPressed(e -> {
            String keyPressed = e.getText();

            if (keyPressed.equalsIgnoreCase("a")) {
                count++;
            }

            t.setText("" + count);
        });

        s.setScene(scene);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
