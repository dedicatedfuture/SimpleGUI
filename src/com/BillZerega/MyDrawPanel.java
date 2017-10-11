package com.BillZerega;

/**
 * Created by Bill on 10/8/17.
 */
import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        //fills background with black as default
        g.fillRect(0,0, this.getWidth(),this.getHeight());


        //creating a random generated color
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);

        //need to set the color otherwise it will paint black and not show
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }

    public void repaint(Graphics g){
        //fills background with black as default
        g.fillRect(0,0, this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }
}
