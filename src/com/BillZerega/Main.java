package com.BillZerega;

import javax.swing.*;
import java.awt.event.*;

//implements hte interface saying an instance of SimpleGuiB IS-A ActionListener
//the button will give events only to ActionListener implementation
public class Main implements ActionListener {

    //make a button
    JButton button;


        public static void main(String[] args) {

            Main gui = new Main();
            gui.go();

        }

        public void go(){
            //make a frame window
            JFrame frame = new JFrame();
            //make a button
            button = new JButton("click me");

            //links button to listening
            button.addActionListener(this);


            //Program quits as soon as you close the window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //adds the button to the frames content
            frame.getContentPane().add(button);


            //give hte frame a size in pixels
            frame.setSize(300, 300);

             /* makes the frame visible */
            frame.setVisible(true);
        }

        //event to happen when button is clicked
        public void actionPerformed(ActionEvent event){
            button.setText("I've been clicked!");
        }

}