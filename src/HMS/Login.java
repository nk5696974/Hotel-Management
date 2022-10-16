package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel l1;
    JLabel l2;
    JTextField t1;
    JPasswordField t2;
    JButton login;
    JButton cancel;
    JLabel l3;

    Login(){

        ImageIcon i1 = new ImageIcon("src/HMS/second2.PNG");

        l3 = new JLabel(i1);
        l3.setBounds(220,0,150,150);

        login = new JButton("Login");
        login.setBounds(20,90,80,30);
        login.setFocusable(false);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);

        cancel = new JButton("Cancel");
        cancel.setBounds(120,90,80,30);
        cancel.setFocusable(false);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);

        t1 = new JTextField();
        t1.setBounds(110,25,120,25);

        t2 = new JPasswordField();
        t2.setBounds(110,55,120,25);

        l1 = new JLabel("Username");
        l1.setBounds(10,20,100,30);
        l1.setFont(new Font("Railway",Font.PLAIN,20));

        l2 = new JLabel("Password");
        l2.setBounds(10,50,100,30);
        l2.setFont(new Font("Railway",Font.PLAIN,20));

        this.setSize(360,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Login");
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        getContentPane().setBackground(Color.WHITE);

        this.add(l3);
        this.add(login);
        this.add(cancel);
        this.add(t1);
        this.add(t2);
        this.add(l1);
        this.add(l2);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cancel){
            this.dispose();
        }
        else if (e.getSource()==login){
            System.out.println("Login");
        }
    }
//    public static void main(String[] args) {
//        new Login();
//    }
}
