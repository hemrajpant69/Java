import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.input.*;
import javafx.scene.layout.HBox;
public class Noalphabet extends Application {
	int count=0;
@Override
public void start(Stage s)throws Exception{
	
	TextField t=new TextField();
	t.setEditable(false);
	HBox root=new HBox();
	root.getChildren().addAll(t);
	Scene scene=new Scene(root,200,200);
	scene.setOnKeyPressed(e->{
		String alphabet=e.getText();
	if(alphabet.equalsIgnoreCase("a")) {
		count++;
	}
	t.setText(""+count);
	});
	s.setScene(scene);
	s.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
