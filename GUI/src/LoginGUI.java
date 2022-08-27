import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {
        private static JLabel username;
        private static JTextField usernameText;
        private static JLabel password;
        private static JPasswordField passwordText;
        private static JButton submit;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        //for username input
        username = new JLabel("Username");
        username.setBounds(10,20,80,25);
        panel.add(username);

        usernameText = new JTextField();
        usernameText.setBounds(100,20,165,25);
        panel.add(usernameText);

        //for password input
        password = new JLabel("Password");
        password.setBounds(10, 60, 80, 25);
        panel.add(password);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,60,165,25);
        panel.add(passwordText);

        submit = new JButton("Submit");
        submit.setBounds(30, 100, 120, 25);
        submit.addActionListener(new LoginGUI());
        panel.add(submit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usernameText.getText();
        String password = passwordText.getText();

        //TODO Create a file to store username and password
        //TODO Show a message that says "Successfully saved username and password"
        //TODO Set username and password to none to add more username and password
    }
}
