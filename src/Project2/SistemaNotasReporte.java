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
    
    
    
    public SistemaNotasReporte(int x)
    {
        this.baseDatos = new Examen[x];
        index = 0;
    }
    
    public void addExamen(String name, String dad, String mom, int points)
    {
        this.baseDatos[index] = new Examen();
        
        this.baseDatos[index].setName(name);
        this.baseDatos[index].setFather(dad);
        this.baseDatos[index].setMother(mom);
        this.baseDatos[index].setPointsEarned(points);
        this.baseDatos[index].setGrade((points / 25) * 100); //change to double all points
        
        index++;
    }
    
    public String generarReporteTodosExamenes()
    {
        return "text";
    }
    
    public String generarReporteTodosAlumnos()
    {
        return "text";
    }
    
    public String generarReporteAlumnosConNotaInferiorA(int grade)
    {
        return "text";
    }
    
    public String generarReporteTodosExamenesOrdenadosPor(String parameter)
    {
        return "text";
    }
}
