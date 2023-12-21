import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
public class Example extends Application {
@Override
public void start(Stage s)throws Exception{
Button red= new Button("Red");
Button black= new Button("Black");
HBox root=new HBox(20);
root.getChildren().addAll(red,black);
Scene scene=new Scene(root,200,200);
s.setScene(scene);
s.show();
red.setOnAction(e->root.setStyle("-fx-background-color:red"));
black.setOnAction(e->root.setStyle("-fx-background-color:black"));
}
	

	public static void main(String[] args) {
		launch(args);

	}

}
