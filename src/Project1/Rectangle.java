/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class Rectangle extends JPanel
{   
    int positionX;
    int positionY;
    int sizeX;
    int sizeY;

    public void setPositionX(int positionX)
    {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY)
    {
        this.positionY = positionY;
    }

    public void setSizeX(int sizeX)
    {
        this.sizeX = sizeX;
    }

    public void setSizeY(int sizeY)
    {
        this.sizeY = sizeY;
    }
    
    @Override
    public void paintComponent(Graphics drawing)      // Function takes a parameter of type Graphics
    {   
        super.paintComponent(drawing);
        this.setBackground(new Color(128, 128, 128));
        
        drawing.setColor(Color.white);
        drawing.fillRect(this.positionX, this.positionY, this.sizeX, this.sizeY);
    }
}
