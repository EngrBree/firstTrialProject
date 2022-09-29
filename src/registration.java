import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registration extends JDialog {

    private JTextField textFname;
    private JTextField textFEmail;
    private JTextField tfAdress;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmpasword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel registerpanel;

    public registration(JFrame parent) {
        super(parent);
        setTitle("Create new account");
        setContentPane(registerpanel);
        setMinimumSize(new Dimension(450, 470));
        setModal(true);
        setLocationRelativeTo(parent);//display dialog middle of the frame


        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);//make dikalog visible
    }

    private void registerUser() {
        String name = textFname.getText();
        String email = textFEmail.getText();
        String adress = tfAdress.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmpassword = String.valueOf(pfConfirmpasword.getPassword());
        if (name.isEmpty() || email.isEmpty() || adress.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please Enter All Fields",
            "Try Again",

                    JOptionPane.ERROR_MESSAGE);
            return;


        }


    }

    public static void main(String[] args) {

        registration myform = new registration(null);
    }

}


