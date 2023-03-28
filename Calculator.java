package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Calculator extends JFrame {
    private JLabel heading;
    private JLabel clocklabel;
    private Font font= new Font("", Font.BOLD,16);

    Calculator() {

        super.setTitle("Clock");
        super.setSize(300, 300);
        super.setLocation(200, 50);
        super.setVisible(true);
        this.createGUI();
        this.startclock();
    }
 public void createGUI(){
        heading= new JLabel(" My Clock ");
        clocklabel= new JLabel(" Clock" );
        heading.setFont(font);
        clocklabel.setFont( font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clocklabel);
 }

public void startclock(){
Timer timer =new Timer(1000, new AbstractAction()
   {
    @Override
    public void actionPerformed(ActionEvent e) {
        //String dateTime= new Date().toString();
        String dateTime= new Date().toLocaleString();
        clocklabel.setText(dateTime);
           }
      });
          timer.start();
    }

    public static void main(String[] args) {
        System.out.println("testing ");
        Calculator c= new Calculator();
    }
}