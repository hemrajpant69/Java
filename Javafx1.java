// To change the required background color
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.HBox; 
public class Javafx1 extends Application{
@Override
public void start(Stage s){
Button black=new Button("Black");
Button red=new Button("Red");
HBox root=new HBox();
root.getChildren().addAll(black,red);
Scene scene=new Scene(root,200,200);
s.setScene(scene);
black.setOnAction(e-> root.setStyle("-fx-background-color:black"));
red.setOnAction(e->root.setStyle("-fx-background-color:red"));
    s.show();
}    

public static void main(String[] args) {
    launch(args);
}
}
