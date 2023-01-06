package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainAppLogin2 extends JFrame {
    public JLabel label1 = new JLabel("Username");
    public JLabel label2 = new JLabel("Password");
    public JLabel label3 = new JLabel("");
    public JLabel label4 = new JLabel("Not a member? ");
    public JLabel label5 = new JLabel("Sign up!");
    public JButton button = new JButton("Login");
    public JTextField usernameinput = new JTextField();
    public JTextField passwordinput = new JTextField();


    MainAppLogin2(){
        super("Login form");
        this.setBounds(300,300,290,230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(null);
        label1.setBounds(10,0,100,30);
        usernameinput.setBounds(10,30,150,20);
        label2.setBounds(10,50,100,30);
        passwordinput.setBounds(10,80,150,20);
        button.setBounds(10,110,100,30);
        label3.setBounds(10,142,200,20);
        label4.setBounds(70,150,90,30);
        label5.setBounds(160,150,50,30);
        label5.setForeground(Color.magenta);
        Font myfont = new Font("Helvetica", Font.ITALIC, 13);
        label5.setFont(myfont);

        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame;
                frame = new JFrame("Sign-up form");
                frame.setVisible(true);
                frame.setSize(290, 230);
            }
        });

        Point point = new Point(0,0);
        Toolkit tkit = Toolkit.getDefaultToolkit();
        Image img = tkit.getImage("png1.png");
        Cursor cursor = tkit.createCustomCursor(img, point, "pointer");
        label5.setCursor(cursor);
        container.add(label1);
        container.add(usernameinput);
        container.add(label2);
        container.add(passwordinput);
        container.add(button);
        container.add(label3);
        container.add(label4);
        container.add(label5);

        button.addActionListener(new Events());


    }
    class Events implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameinput.getText();
            String password = passwordinput.getText();
            label3.setText(username + " "+ password);
            if (!usernameinput.getText().equals("Archie") || !passwordinput.getText().equals("0000")){
                label3.setText("Wrong login or password!");

            }else{
                JFrame frame = new JFrame("New frame");
                frame.setSize(200,200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        }
    }
}
