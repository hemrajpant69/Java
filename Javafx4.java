// Calculator using Javafx

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class Javafx4  extends Application{
    @Override
    public void start(Stage s) throws Exception{
        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField ans =new TextField();
        Button add=new Button("+");
        Button sub=new Button("-");
        Button mul=new Button("*");
        Button div =new Button("/");
        GridPane root =new GridPane();
        root.addColumn(0, t1,add,mul);
        root.addColumn(1, t2,sub,div);
        root.addColumn(2, ans);
        Scene scene=new Scene(root,200,200);
        s.setTitle("Calculator");
        s.setScene(scene);
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        add.setOnAction(e->{
            ans.setText(""+(a+b));


        });
        sub.setOnAction(e->{
            ans.setText(""+(a-b));
        });

        mul.setOnAction(e->{
         ans.setText(""+(a*b));

        });
        div.setOnAction(e->{
            ans.setText(""+(a/b));

        });

        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
