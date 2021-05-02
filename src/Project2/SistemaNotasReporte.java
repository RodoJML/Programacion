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
    
    public String generarReporteTodosExamenes()
    {
        String allExams = ""; 
        
        for(int i = 0; i < totalExamns; i++)
        {
            allExams +=  this.baseDatos[i].getGrade();
            allExams += "\n";
        }
        
        return allExams;
    }
    
    public String generarReporteTodosAlumnos()
    {
        String allStudents = "";
        
        for(int i = 0; i < totalExamns; i++)
        {
            allStudents += "Student: ";
            allStudents +=  this.baseDatos[i].getName();
            allStudents += "\n";
        }
        
        return allStudents;
    }
    
    public String generarReporteAlumnosConNotaInferiorA(int grade)
    {
        String allGradesBelowX = "";
        
        for(int i = 0; i < totalExamns; i++)
        {
            if(this.baseDatos[i].getGrade() < grade)
            {
                allGradesBelowX += String.valueOf(this.baseDatos[i].getGrade());
                allGradesBelowX += " - ";
                allGradesBelowX += this.baseDatos[i].getName();
                allGradesBelowX += "\n";
            }
        }
        return allGradesBelowX;
    }

    public int getIndex()
    {
        return index;
    }
    
    public double generarReporteTodosExamenesOrdenadosPor(String parameter)
    {
        private void mergeSort()
        {
            
        }
        return 0;
    }
    
}
