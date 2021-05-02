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
    ReportLenght amountOfExams  = new ReportLenght();
    SistemaNotasReporte model   = new SistemaNotasReporte(amountOfExams.UserDefinesReportLenght()); 
    SistemaNotasInterfaz view   = new SistemaNotasInterfaz(model, amountOfExams);
    
    byte gui;
    
    public void start()
    {   
        gui = view.displayMode();
        
        view.graphicWelcomeScreen(gui);
        boolean reportExists = false;
                
        while (true)
        {
            switch(view.graphicMainMenu(gui))
            {
                case 0:
                {
                    if(model.getIndex() >= amountOfExams.getUserDefinedLenght())
                    {
                        view.graphicReportFull(gui);
                    }
                        else
                        {
                            for(byte i = 0; i < amountOfExams.getUserDefinedLenght(); i++)
                            {
                                view.graphicEnterExamInfo(i, gui);
                            }
                        }
                        reportExists = true;
                        break;
                }
                        
                case 1:
                {
                    if(reportExists == false)
                        break;
                            
                    view.graphicPrintAllExamsInfo(gui);
                    break;
                } 
                    
                case 2:
                {
                    if(reportExists == false)
                        break;
                            
                    view.graphicPrintAllStudentsInfo(gui);
                    break;
                } 
                    
                case 3:
                {
                    if(reportExists == false)
                        break;
                            
                    view.graphicPrintAllExamnsBelowGrade(gui);
                    break;
                } 
                    
                case 4:
                {
                    if(reportExists == false)
                        break;

                    view.graphicExamsSortedBy(gui);
                    break;
                } 
            }
        }
    }
} 
