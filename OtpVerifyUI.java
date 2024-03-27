import javax.swing.*;
import java.awt.event.*;

public class OtpVerifyUI {
    JFrame f;

    public OtpVerifyUI() {
        f = new JFrame();
        f.setSize(200, 200);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Handle window closing event if needed
                System.exit(0); // Forcibly terminate the application
            }
        });

        String otp = JOptionPane.showInputDialog(null, "Please Enter Otp");
        if (otp == null || !otp.equals("hemraj")) {
            JOptionPane.showMessageDialog(null, "Wrong OTP ", "Login Failed", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(f, "Congratulations", "Login Successful", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new OtpVerifyUI();
    }
}
