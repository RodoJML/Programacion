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
    private String dialog0 = "Welcome to the Grades Report App!";
    private String dialog6 = "\nPlease select the view mode you want to execute this application\n (0) Interactive Mode  -> Interact with the app using the console only.\n (1) Graphic Mode      -> Interact with the app using the integrated Java user Interface.\n\n Mode selected: ";
    private String dialog7 = "=== [ Main Menu ] ===\n\n0 - Add exam(s) information\n1 - Generate report for all exams\n2 - Generate report for all students\n3 - Generate report for students with a grade below...\n4 - Generate report for all examns sorted by...\n\nPlease select an option by entering a number below:";
    private String dialog8 = "\nREMINDER: This report can hold up to ";
    private String dialog9 = "Show all exams below grade: ";
    
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
    
    public void graphicWelcomeScreen()
    {
        JOptionPane.showMessageDialog(null, dialog0 + dialog8 + lenght.getUserDefinedLenght() + " exams only.");
    }
    
     public byte graphicMainMenu()
    {
        return Byte.parseByte(JOptionPane.showInputDialog(dialog7));
    }

    public void graphicEnterExamInfo(byte index)
    {        
        JTextField field0 = new JTextField();
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        
        Object[] fields = {"Student Name", field0, "Parent Name", field1, "Points earned (25 total)", field2};
        JOptionPane.showConfirmDialog(null, fields, "Exam Information", JOptionPane.OK_CANCEL_OPTION);
        this.model.addExamen(field0.getText(), field1.getText(), Integer.parseInt(field2.getText()));
        JOptionPane.showMessageDialog(null, field0.getText() + "'s grade is " + model.baseDatos[index].getGrade());
    }
    
    public void graphicPrintAllExamsInfo()
    {
        JOptionPane.showMessageDialog(null, model.generarReporteTodosExamenes());
    }
    
    public void graphicPrintAllStudentsInfo()
    {
        JOptionPane.showMessageDialog(null, model.generarReporteTodosAlumnos());
    }
    
    public void graphicPrintAllExamnsBelowGrade()
    {
        JOptionPane.showMessageDialog(null, model.generarReporteAlumnosConNotaInferiorA(
                Integer.valueOf(JOptionPane.showInputDialog(dialog9))));
    }
    
    
    public void graphicReportFull()
    {
        JOptionPane.showMessageDialog(null, "Report is full! \nNo more exams can be added");
    }
}
