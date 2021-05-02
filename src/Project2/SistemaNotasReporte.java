/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770 
 */
public class SistemaNotasReporte
{
    Examen[] baseDatos;
    private int index;
    private int totalExamns;
    
    public SistemaNotasReporte(int amountOfStundents)
    {
        this.baseDatos = new Examen[amountOfStundents];
        this.totalExamns = amountOfStundents;
        index = 0;
    }
    
    public void addExamen(String name, String parent, double points) 
    {
        this.baseDatos[index] = new Examen();
        this.baseDatos[index].setName(name);
        this.baseDatos[index].setParent(parent);
        this.baseDatos[index].setPointsEarned(points);
        this.baseDatos[index].setGrade((points / 25) * 100);
        index++;
    }
    
    public String generarReporteTodosExamenes(int numberOfStudents)
    {
        String allExams = ""; 
        
        for(int i = 0; i < numberOfStudents; i++)
        {
            allExams +=  this.baseDatos[i].getGrade();
            allExams += "\n";
        }
        
        return allExams;
    }
    
    public String generarReporteTodosAlumnos(int numberOfStudents)
    {
        String allStudents = "";
        
        for(int i = 0; i < numberOfStudents; i++)
        {
            allStudents += "Student: ";
            allStudents +=  this.baseDatos[i].getName();
            allStudents += " Parent: ";
            allStudents +=  this.baseDatos[i].getParent();
            allStudents += "\n";
        }
        
        return allStudents;
    }
    
    public String generarReporteAlumnosConNotaInferiorA(int grade)
    {
        return "text";
    }
    
    public String generarReporteTodosExamenesOrdenadosPor(String parameter)
    {
        return "text";
    }

    public int getIndex()
    {
        return index;
    }
    
    
}
