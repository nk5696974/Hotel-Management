package HMS;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JLabel l1;
    JLabel l2;
    JButton b1;

    Main(){

        ImageIcon image  = new ImageIcon("src/HMS/first.jpg");

        b1 = new JButton("Next");
        b1.setBounds(1150,450,100,50);
        b1.setFocusable(false);
        b1.setFont(new Font("Railway",Font.BOLD,25));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);

        l2 = new JLabel("Hotel Management System");
        l2.setBounds(20,400,1000,100);
        l2.setFont(new Font("Railway",Font.PLAIN,50));
        l2.setForeground(Color.WHITE);

        l1 = new JLabel(image);
        l1.setBounds(0,0,1366,565);
        l1.add(l2);
        l1.add(b1);

        this.setSize(1366,565);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Hotel Management System");
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.add(l1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Login();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        // write your code here
        new Main();
    }
}
