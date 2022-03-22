package View;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    private JButton addNewAccount = new JButton("Add new account");


    public Gui(){
        super("Trade App");
        this.setBounds(400,200,500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(6,3,5,5));

        //cont.setLayout();
        cont.add(addNewAccount);



        this.setVisible(true);
    }
}
