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
    private double[] sortedExams;
    private int index;
    private int totalExams;
    
    public SistemaNotasReporte(int amountOfStundents)
    {
        this.baseDatos = new Examen[amountOfStundents];
        this.totalExams = amountOfStundents;
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
        
        for(int i = 0; i < totalExams; i++)
        {
            allExams += "Grade: ";
            allExams +=  this.baseDatos[i].getGrade();
            allExams += "\n";
        }
        
        return allExams;
    }
    
    public String generarReporteTodosAlumnos()
    {
        String allStudents = "";
        
        for(int i = 0; i < totalExams; i++)
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
        
        for(int i = 0; i < totalExams; i++)
        {
            if(this.baseDatos[i].getGrade() < grade)
            {
                allGradesBelowX += "Grade: ";
                allGradesBelowX += String.valueOf(this.baseDatos[i].getGrade());
                allGradesBelowX += " - Student: ";
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
    
    public String generarReporteTodosExamenesOrdenadosPor(int parameter)
    {
        String sorted = null;
        double[] array = new double[totalExams];
       
        if(parameter < 2)
        {
            switch(parameter)
            {
                case 0:
                {
                    for(int i = 0; i < totalExams; i++)
                    {
                        array[i] = this.baseDatos[i].getGrade();
                    }
                    sorted = "";
                    break;
                }
                
                case 1:
                {
                    for(int i = 0; i < totalExams; i++)
                    {
                        array[i] = this.baseDatos[i].getPointsEarned();
                    }
                    sorted = "";
                    break;
                }
            }
            
            mergeSort(array, 0, totalExams - 1);
            
            for(int i = 0; i < totalExams; i++)
            {
                sorted += String.valueOf(this.sortedExams[i]);
                sorted += "\n";
            }
        }

        return sorted;
    }
    
    private void mergeSort(double array[], int start, int end)
    {
        if(start >= end)
            return;
        
        int middle = (start + end) / 2;
        
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
        
        merge(array, start, end);
    }
    
    private void merge(double array[], int start, int end)
    {
        double[] temporaryArray = new double[totalExams];
        
        int indexMiddle = (start + end) / 2;
        int indexStart0 = start;
        int indexStart1 = indexMiddle + 1;
        int indexNew = start;
        
        while(indexStart0 <= indexMiddle && indexStart1 <= end) // This is a validation 
        {
            if(array[indexStart0] < array[indexStart1])
                temporaryArray[indexNew++] = array[indexStart0++];
            else
                temporaryArray[indexNew++] = array[indexStart1++];
        }
        
        while(indexStart0 <= indexMiddle)
            temporaryArray[indexNew++] = array[indexStart0++];
        
        while(indexStart1 <= end)
            temporaryArray[indexNew++] = array[indexStart1++];
        
        for(int i = start; i <= end; i++)
        {
            array[i] = temporaryArray[i];
        }
        
        this.sortedExams = array;
    }
        
}
