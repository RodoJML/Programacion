/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770 
 */
public class SistemaNotasInterfaz
{
    SistemaNotasReporte model;
    Scanner read;
    
    public SistemaNotasInterfaz(SistemaNotasReporte parameter)
    {
        this.model = parameter;
    }
    
    public byte displayMode()
    {
        read = new Scanner(System.in);
        byte selectedOption;
        
        System.out.print("Before starting please select the display mode you want to run"
                + "\n (0) Interactive Mode  -> This mode uses the console to interact"
                + "\n (1) Graphic Mode      -> This mode uses the integrated Java user Interface"
                + "\n\n Mode selected: ");
        
        selectedOption = read.nextByte();
        return selectedOption;
    }
}
