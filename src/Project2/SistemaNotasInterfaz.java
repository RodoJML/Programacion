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
    ReportLenght lenght;
    Scanner read;
    
    //Dialogs to be used within the interface.
    private String dialog0 = "Welcome to Grades Report app!";
    private String dialog6 = "\nPlease select the view mode you want to execute this application\n0 - Interactive Mode : Interact with the app using the console only.\n1 - Graphic Mode     : Interact with the app using the integrated Java user Interface.\n\nMode selected: ";
    private String dialog7 = "=== [ Main Menu ] ===\n\n0 - Add exam(s) information\n1 - Generate report for all exams\n2 - Generate report for all students\n3 - Generate report for students with a grade below...\n4 - Generate report for all examns sorted by...\n\nPlease select an option by entering a number: ";
    private String dialog8 = "NOTICE: This report can hold up to ";
    private String dialog9 = "Show all exams below grade: ";
    private String dialog10 = "Please select the sort method \n0 - Grades\n1 - Points";
    private String dialog11 = "The selected option is not a valid sort method.";
    private String dialog12 = "Report is full, no more exams can be added.";
    
    public SistemaNotasInterfaz(SistemaNotasReporte parameter0, ReportLenght parameter1)
    {
        this.model  = parameter0;
        this.lenght = parameter1;
    }
    
    public byte displayMode()
    {
        read = new Scanner(System.in);
        byte selectedOption;
        
        System.out.print(dialog6);
        selectedOption = read.nextByte();
        return selectedOption;
    }
    
    public void graphicWelcomeScreen(byte gui)
    {
        if(gui == 1)
            JOptionPane.showMessageDialog(null, dialog8 + lenght.getUserDefinedLenght() + " exams only.", dialog0, 2);
        
        if(gui == 0)
        {
            System.out.println("\n"+ dialog0);
            System.out.println(dialog8 + lenght.getUserDefinedLenght() + " exams only.");
        }    
    }
    
    public byte graphicMainMenu(byte gui)
    {
        byte option = 5;
        
        if(gui == 1)
            option = Byte.parseByte(JOptionPane.showInputDialog(dialog7));
        
        if(gui == 0)
        {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.print(dialog7);
            option = read.nextByte();
            System.out.print("\n");
        }    
        return option;
    }

    public void graphicEnterExamInfo(byte index, byte gui)
    {
        if(gui == 1)
        {
            JTextField field0 = new JTextField();
            JTextField field1 = new JTextField();
            JTextField field2 = new JTextField();
        
            Object[] fields = {"Student name", field0, "Parent name", field1, "Points earned (25 total)", field2};
            JOptionPane.showConfirmDialog(null, fields, "Exam Information", JOptionPane.OK_CANCEL_OPTION);
            
            this.model.addExamen(field0.getText(), field1.getText(), Integer.parseInt(field2.getText()));
            JOptionPane.showMessageDialog(null, field0.getText() + "'s grade is " + model.baseDatos[index].getGrade());
        }
        
        if(gui == 0)
        {
            System.out.println("* This exam has a total of 25 points.");
            System.out.print("Student name  : ");
            String student = read.next();
            System.out.print("Parent name   : ");
            String parent = read.next();
            System.out.print("Points earned : ");
            double points = read.nextDouble();
            
            this.model.addExamen(student, parent, points);
            System.out.print(student + "'s grade is " + model.baseDatos[index].getGrade() + "\n\n");
        }
    }
    
    public void graphicPrintAllExamsInfo(byte gui)
    {
        if(gui == 1)
            JOptionPane.showMessageDialog(null, model.generarReporteTodosExamenes());
        
        if(gui == 0)
            System.out.print(model.generarReporteTodosExamenes());
    }
    
    public void graphicPrintAllStudentsInfo(byte gui)
    {
        if(gui == 1)
            JOptionPane.showMessageDialog(null, model.generarReporteTodosAlumnos());
        
        if(gui == 0)
            System.out.print(model.generarReporteTodosAlumnos());
    }
    
    public void graphicPrintAllExamnsBelowGrade(byte gui)
    {
        if(gui == 1)
        {
            JOptionPane.showMessageDialog(null, model.generarReporteAlumnosConNotaInferiorA(
                Integer.valueOf(JOptionPane.showInputDialog(dialog9))));
        }
        
        if(gui == 0)
        {
            System.out.print(dialog9);
            System.out.print(model.generarReporteAlumnosConNotaInferiorA(read.nextByte()));
        }
    }
    
    public void graphicReportFull(byte gui)
    {
        if(gui == 1)
        JOptionPane.showMessageDialog(null, dialog12, "Error", 0);
        
        if(gui == 0)
        System.out.println("** " + dialog12 + " **");
    }
    
    public void graphicExamsSortedBy(byte gui)
    {
        if(gui == 1)
        {
            int option = Integer.valueOf(JOptionPane.showInputDialog(dialog10));
        
            if(option != 1 && option != 0)
            {
                JOptionPane.showMessageDialog(null, dialog11);
                return;
            }
            
            JOptionPane.showMessageDialog(null, model.generarReporteTodosExamenesOrdenadosPor(option));
        }
        
        if(gui == 0)
        {
            System.out.println(dialog10);
            System.out.print("Select: ");
            int option = read.nextInt();
            
            if(option != 1 && option != 0)
            {
                System.out.println(dialog11);
                return;
            }
            System.out.print("\n" + model.generarReporteTodosExamenesOrdenadosPor(option));
        }
    }
}
