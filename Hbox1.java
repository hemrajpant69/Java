import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
public class Hbox1 extends Application {
    @Override
    public void start(Stage s){

        Button b1=new Button("Click");
        Button b2=new Button ("Dont Click");
        Button b3=new Button("Its Your Choice");
        HBox root=new HBox();
        root.getChildren().addAll(b1,b2,b3);
        Scene scene =new Scene(root,200,200);
        s.setScene(scene);
        s.setTitle("JavaFx");
        s.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
