package com.BillZerega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main{

    //make a button
    JLabel label;
    JFrame frame;


        public static void main(String[] args) {

            Main gui = new Main();
            gui.go();

        }

        public void go(){
            frame = new JFrame();

            //make a button for the label
            JButton labelButton = new JButton("Change Label");
            //links button to listening
            labelButton.addActionListener(new LabelListener());

            //make a button for the color
            JButton colorButton = new JButton("Change Circle");
            //links button to listening
            colorButton.addActionListener(new ColorListener());

            //Program quits as soon as you close the window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//      different way to add a  listener:      button.addActionListener(this);

            label = new JLabel("I'm a label");
            MyDrawPanel drawPanel = new MyDrawPanel();

            //adds the button to the frames content
            frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
            frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
            frame.getContentPane().add(BorderLayout.EAST, labelButton);
            frame.getContentPane().add(BorderLayout.WEST, label);


            //give hte frame a size in pixels
            frame.setSize(500, 500);

             /* makes the frame visible */
            frame.setVisible(true);
        }

    //implements the interface saying an instance of LabelListener IS-A ActionListener
//the button will give events only to ActionListener implementation
        //inner class used to be able to use 2 different event listeners
        class LabelListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                if (label.getText() == "I'm a label"){
                    label.setText("Ouch!");
                }else{
                    label.setText("I'm a label");
                }

            }
        }

        class ColorListener implements ActionListener {
            //event to happen when button is clicked
            public void actionPerformed(ActionEvent event) {
                frame.repaint();
            }
        }
}