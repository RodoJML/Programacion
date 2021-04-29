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
public class SistemaNotasControlador
{
    SistemaNotasReporte model;
    SistemaNotasInterfaz view;
    
    byte gui;
    
    public void start()
    {
        view = new SistemaNotasInterfaz(model);   
        gui = view.displayMode();
        
        switch(gui)
        {
            case 0:
            {
                
            }
            
            case 1:
            {
                view.graphicWelcomeScreen();
                model = new SistemaNotasReporte(view.graphicAskNumberOfStudents());
                view.graphicEnterExamInfo();
            }
        }
        
    }
}
