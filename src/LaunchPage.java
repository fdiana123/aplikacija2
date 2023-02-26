import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton Login = new JButton("Login");
    // pielikt ievades sistemu parole un login
    JButton View = new JButton("Register");


    LaunchPage() {
        JLabel emailOutput = new JLabel("");
        emailOutput.setBounds(30, 10, 100, 10);
        Login.addActionListener(this);


        Login.setBounds(100, 60, 200, 40);
        Login.setFocusable(false);
        Login.addActionListener(this);

        View.setBounds(100, 160, 200, 40);
        View.setFocusable(false);
        View.addActionListener(this);


        frame.add(View);
        frame.add(Login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Login) {
            Register RegisterWindow = new Register();
        } else if (e.getSource() == View) {
            Wiew Wiewinfo = new Wiew();

        }
    }
}