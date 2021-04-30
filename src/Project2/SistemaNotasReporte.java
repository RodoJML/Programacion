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
    
    public SistemaNotasReporte (int numberOfStudents)
    {
        baseDatos = new Examen[numberOfStudents];
    }
    
    public SistemaNotasReporte (Examen[] examenes)
    {
        this.baseDatos = examenes;
    }
    
    public void addExamen(int index, String name, String dad, String mom, int points)
    {
        baseDatos[index].setName(name);
        baseDatos[index].setFather(dad);
        baseDatos[index].setMother(mom);
        baseDatos[index].setPointsEarned(points);
        baseDatos[index].setGrade(points / 25);
    }
    
    public void generarReporteTodosExamenes()
    {
        
    }
    
    public void generarReporteTodosAlumnos()
    {
        
    }
    
    public void generarReporteAlumnosConNotaInferiorA(int grade)
    {
        
    }
    
    public void generarReporteTodosExamenesOrdenadosPor(String parameter)
    {
        
    }
}
