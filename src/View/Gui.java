package View;

import DAO.DataBase;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    DataBase dataBase = new DataBase();
    private JComboBox<String> comboBoxAccounts = new JComboBox<>();
    private JButton addNewAccount = new JButton("Add new account");
    private JButton addNewBid = new JButton("Add new bid");

    String[] colomnNames = {"id", "Stock name", "Stock quantity", "Cost"};
    private  JTable table = new JTable(dataBase.getUserData(1L), colomnNames);


    public Gui(){
        super("Trade App");
        this.setBounds(400,200,500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(6,5,5,5));

        //cont.setLayout();
        cont.add(comboBoxAccounts);
        cont.add(addNewAccount);
        cont.add(table);
        cont.add(addNewBid);



        this.setVisible(true);
    }
}
