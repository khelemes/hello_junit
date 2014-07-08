package com.engagepoint.hello;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lyolik on 08.07.2014.
 */
public class gui1 extends JFrame {
    private JButton button1;
    private JPanel rootPanel;

    public gui1() {
        super("Hello world!");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(gui1.this,"You clicked a button!");
                button1.setText("You clicked");
            }
        });

        setVisible(true);

    }

    public static void main(String[] arg) {
        gui1 g1=new gui1();
    }
}
