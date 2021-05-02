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
        
        switch(gui)
        {
            case 0:
            {
                break;
            }
            
            case 1:
            {
                view.graphicWelcomeScreen();
                boolean reportedExist = false;
                
                while (true)
                {
                    switch(view.graphicMainMenu())
                    {
                        case 0:
                        {
                            if(model.getIndex() >= amountOfExams.getUserDefinedLenght())
                            {
                                view.graphicReportFull();
                            }
                            else
                            {
                                for(byte i = 0; i < amountOfExams.getUserDefinedLenght(); i++)
                                {
                                    view.graphicEnterExamInfo(i);
                                }
                            }
                            reportedExist = true;
                            break;
                        }    
                    
                        case 1:
                        {
                            if(reportedExist == false)
                                break;
                            
                            view.graphicPrintAllExamsInfo();
                                break;
                        } 
                    
                        case 2:
                        {
                            if(reportedExist == false)
                                break;
                            
                            view.graphicPrintAllStudentsInfo();
                            break;
                        } 
                    
                        case 3:
                        {
                            if(reportedExist == false)
                                break;
                            
                            view.graphicPrintAllExamnsBelowGrade();
                            break;
                        } 
                    
                        case 4:
                        {
                            if(reportedExist == false)
                                break;
                            
                            view.graphicExamsSortedBy();
                            break;
                        } 
                    }
                }
            }
        } 
    }
}
