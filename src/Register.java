import javax.swing.*;
import java.awt.*;

public class Register {


    JFrame frame = new JFrame();
    JLabel label = new JLabel("info par dzivnikiem");

    //pielikt klát info par dzivnieku kad loginejas ieksha
    Register(){

        label.setBounds(15,0,100,50);
        label.setFont(new Font(null, Font.BOLD, 24));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}

