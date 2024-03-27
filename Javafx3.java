// to track mouse pointer
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.input.*;

public class Javafx3 extends Application {
    @Override
    public void start(Stage s)throws Exception{
        TextField t1=new TextField();
        TextField t2=new TextField();
        HBox root =new HBox();
        root.getChildren().addAll(t1,t2);
        Scene scene =new Scene(root,200,200);
        s.setScene(scene);
        scene.setOnMouseMoved(e->{
            t2.setText("X="+e.getX()+" Y="+e.getY());

        });
        scene.setOnMouseEntered(e->{
            t1.setText("IN");


        });
        scene.setOnMouseExited(e->{
           t1.setText("Out");

        });
        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
