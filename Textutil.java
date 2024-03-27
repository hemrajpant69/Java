import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Textutil extends JFrame implements ActionListener{
    public Textutil(){

    
    JTextField t1=new JTextField();
    JButton b1=new JButton("Click");
    t1.setColumns(20);
    add(t1);
    add(b1);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    b1.addActionListener(this);
    

@Override
public void actionPerformed(ActionEvent e){
    String t=t1.getText();
}
}
}
