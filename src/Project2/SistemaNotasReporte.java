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
    private String Name;
    private String Father;
    private String Mother;
    private byte grade;
    private int index;
    private SistemaNotasReporte[] notesArray;

    public SistemaNotasReporte(String Name, String Father, String Mother, byte grade)
    {
        this.Name = Name;
        this.Father = Father;
        this.Mother = Mother;
        this.grade = grade;
    }
    
    public SistemaNotasReporte(int amountOfStudents)
    {
        notesArray = new SistemaNotasReporte[amountOfStudents];
        index = 0;
    }
    
    public void addGrade
    
    
}
