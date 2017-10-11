package com.BillZerega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//implements hte interface saying an instance of SimpleGuiB IS-A ActionListener
//the button will give events only to ActionListener implementation
public class Main implements ActionListener {

    //make a button
    JButton button;
    JFrame frame;


        public static void main(String[] args) {

            Main gui = new Main();
            gui.go();

        }

        public void go(){
            frame = new JFrame();
            //make a button
            button = new JButton("Change Colors");

            //links button to listening
            button.addActionListener(this);


            //Program quits as soon as you close the window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MyDrawPanel drawPanel = new MyDrawPanel();

            //adds the button to the frames content
            frame.getContentPane().add(BorderLayout.SOUTH, button);
            frame.getContentPane().add(BorderLayout.CENTER, drawPanel);


            //give hte frame a size in pixels
            frame.setSize(300, 300);

             /* makes the frame visible */
            frame.setVisible(true);
        }

        //event to happen when button is clicked
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }

}