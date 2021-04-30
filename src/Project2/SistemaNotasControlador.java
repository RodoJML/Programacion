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
    SistemaNotasInterfaz view = new SistemaNotasInterfaz(model);
    
    byte gui;
    
    public void start()
    {
        gui = view.displayMode();
        
        switch(gui)
        {
            case 0:
            {
                
            }
            
            case 1:
            {
                view.graphicWelcomeScreen();
                
                switch(view.graphicMainMenu())
                {
                    case 0:
                    {
                        byte numberOfStundents = view.graphicAskNumberOfStudents();
                        model = new SistemaNotasReporte(numberOfStundents);
                        
                        for(byte i = 0; i <= numberOfStundents; i++)
                        {
                            view.graphicEnterExamInfo(i);
                        }
                    }    
                    
                    case 1:
                    {
                    } 
                    
                    case 2:
                    {
                    } 
                    
                    case 3:
                    {
                    } 
                    
                    case 4:
                    {
                    } 
                }
            }
        }
        
    }
}
