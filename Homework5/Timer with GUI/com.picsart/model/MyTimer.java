package com.picsart.model;

import com.picsart.model.MyRunnable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTimer extends JFrame{
    private JTextField minutesTextField = new JTextField("", 5);
    private JLabel labelM = new JLabel(" Enter minutes:");
    private JTextField secondsTextField = new JTextField("", 5);
    private JLabel labelS = new JLabel(" Enter seconds:");
    private JTextArea output = new JTextArea(15, 20);
    private JButton sButton = new JButton("Start");

    //Container container = this.getContentPane();
    public MyTimer(){
        super("My Timer");
        this.setBounds(500, 500, 600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();//forma v kotoruyu mozem pomeshat vse knopki itd
        container.setLayout(new GridLayout(10, 11, 10, 11));
        container.add(labelM);
        container.add(minutesTextField);
        container.add(labelS);
        container.add(secondsTextField);
        container.add(output);
        this.setVisible(true);

        sButton.addActionListener(new ButtonEventListener());
        container.add(sButton);
    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = minutesTextField.getText();
            int currentMin = Integer.parseInt(s);
            String ss = secondsTextField.getText();
            int currentSec = Integer.parseInt(ss);

            Thread t = new Thread(new MyRunnable(currentMin, currentSec, output));
            t.start();
        }
    }
}
