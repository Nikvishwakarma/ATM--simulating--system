package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {

      JButton deposit, withdrawl,ministatement, pinchange, fastcash, balanceenquiry,exit;
      String pinnumber;
      
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("iconss/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(770, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 770, 770);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(175, 270, 600, 20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(150,350,140,25);
        deposit.addActionListener(this); 
        image.add(deposit);
        
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(300,350,140,25);
        withdrawl.addActionListener(this); 
        image.add(withdrawl);
        
        
        fastcash = new JButton("Fast cash"); 
        fastcash.setBounds(150,380,140,25);
        fastcash.addActionListener(this); 
        image.add(fastcash); 
        
        ministatement = new JButton("Mini Statement"); 
        ministatement.setBounds(300,380,140,25);
        ministatement.addActionListener(this); 
        image.add(ministatement); 
        
        pinchange = new JButton("Pin change"); 
        pinchange.setBounds(150,410,140,25);
        pinchange.addActionListener(this); 
        image.add(pinchange); 
        
        balanceenquiry = new JButton("Balance Enquiry"); 
        balanceenquiry.setBounds(300,410,140,25);
        balanceenquiry.addActionListener(this); 
        image.add(balanceenquiry); 
        
        
        exit = new JButton("Exit"); 
        exit.setBounds(300,440,140,25);
        exit.addActionListener(this); 
        image.add(exit); 
        
        
        
        setSize(770, 770);
        setLocation(300, 0);
        
         setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit) {
            System.exit(0); 
        } else if (ae.getSource() == deposit) {
            new Deposit(pinnumber).setVisible(true); 
        } else if (ae.getSource() == withdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true); 
        }  else if (ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true); 
        } else if (ae.getSource() == balanceenquiry) {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true); 
        } else if (ae.getSource() == ministatement) {
            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true); 
        }
    }
    public static void main(String args[]) {
        new Transactions("");
    }
}
