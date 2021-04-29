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
    
    //Dialogs to be used within the interface.
    private String dialog0 = "Welcome to Grade Report app!";
    private String dialog1 = "Please enter the amount of students you want to register: ";
    private String dialog2 = "Please enter student's name: ";
    private String dialog3 = "Please enter student's father name: ";
    private String dialog4 = "Please enter student's mother name: ";
    private String dialog5 = "Please enter student points earned: ";
    private String dialog6 = "Before starting please select the display mode you want to run\n (0) Interactive Mode  -> This mode uses the console to interact\n (1) Graphic Mode      -> This mode uses the integrated Java user Interface\n\n Mode selected: ";
    
    public SistemaNotasInterfaz(SistemaNotasReporte parameter)
    {
        this.model = parameter;
    }
    
    public byte displayMode()
    {
        read = new Scanner(System.in);
        byte selectedOption;
        
        System.out.print(dialog6);
        
        selectedOption = read.nextByte();
        return selectedOption;
    }
    
    public void graphicWelcomeScreen()
    {
        JOptionPane.showMessageDialog(null, dialog0);
    }
    
    public int graphicAskNumberOfStudents()
    {
        byte numberOfStudents = Byte.parseByte(JOptionPane.showInputDialog(dialog1));
        return numberOfStudents;
    }
    
    public void graphicEnterExamInfo()
    {
        JOptionPane.showInputDialog(dialog2);
        JOptionPane.showInputDialog(dialog3);
        JOptionPane.showInputDialog(dialog4);
        JOptionPane.showInputDialog(dialog5);
    }
}
