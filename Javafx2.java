import javafx.application.Application;
import javafx.scene.input.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
public class Javafx2 extends Application {
    int count=0;

@Override 
public void start(Stage s){
    TextField t=new TextField();
    t.setEditable(false);
    HBox root=new HBox();
    root.getChildren().addAll(t);
    Scene scene=new Scene(root,200,200);
    s.setScene(scene);
    scene.setOnKeyPressed(e->{

String aplha=e.getText();
    if(aplha.equalsIgnoreCase("a")){
        count++;
    }
    t.setText(""+count);

    });

    s.show();
}
public static void main(String[] args) {
    launch(args);
}
    
}
