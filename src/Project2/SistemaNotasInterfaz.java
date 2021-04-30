/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;
import javax.swing.JTextField;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770 
 */
public class SistemaNotasInterfaz
{
    SistemaNotasReporte model;
    Scanner read;
    
    //Dialogs to be used within the interface.
    private String dialog0 = "Welcome to the Grades Report App";
    private String dialog1 = "Please enter the amount of students you want to register in this report: ";
    private String dialog2 = "Please enter student's name: ";
    private String dialog3 = "Please enter student's father name: ";
    private String dialog4 = "Please enter student's mother name: ";
    private String dialog5 = "Please enter student points earned: ";
    private String dialog6 = "Before starting please select the display mode you want to run\n (0) Interactive Mode  -> This mode uses the console to interact\n (1) Graphic Mode      -> This mode uses the integrated Java user Interface\n\n Mode selected: ";
    private String dialog7 = "Main Menu\nPlease select:\n\n(0) Ingresar Informacion de los examenes\n(1) Generar reporte de todos los examenes\n(2) Generar reporte de todos los alumnos\n(3) Generar reporte de alumnos con nota inferior a ...\n(4) Generar reporte de todos los examenes ordenados por...";
    
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
    
    public byte graphicMainMenu()
    {
        return Byte.parseByte(JOptionPane.showInputDialog(dialog7));
    }
    
    public byte graphicAskNumberOfStudents()
    {
        return Byte.parseByte(JOptionPane.showInputDialog(dialog1));
    }
    
    public void graphicEnterExamInfo(int index)
    {        
        JTextField field0 = new JTextField(); //field0.getText()
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        
        Object[] fields = {"Student Name", field0, "Father Name", field1, "Mother Name", field2};
        JOptionPane.showConfirmDialog(null, fields, "Exam Information", JOptionPane.OK_CANCEL_OPTION);
        
        int pointsEarned = Integer.parseInt(JOptionPane.showInputDialog("Points Earned out of 25"));
        
        model.addExamen(index, dialog0, dialog0, dialog0, index);
        
        JOptionPane.showMessageDialog(null, field0.getText() + "grade is " + pointsEarned / 25);

    }
}
