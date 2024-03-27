import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
class Stackpane extends Application{

@Override 
public void start(Stage s){
    Label l1=new Label("Long");
    Label l2=new Label("Short");
    StackPane root=new StackPane();
    root.getChildren().addAll(l1,l2);
    Scene scene=new Scene(root,200,200);
    s.setScene(scene);
    s.setTitle("StackPane JFX");

    s.show();
}
public static void main(String[] args) {
    launch(args);
}
}