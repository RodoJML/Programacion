/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import java.util.Scanner;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class ReportLenght 
{
    // This is an small view interface to ask user the report lenght before initiating the main
    // view interface and main model class. 
    
    int userDefinedLenght;
    Scanner read = new Scanner(System.in);
    
    public int UserDefinesReportLenght()
    {
        System.out.print("Universidad Latina de Costa Rica - BIS03 Programacion I para TI"
                            + "\nBefore initiating this application please indicate how "
                            + "many examns you want to register today: ");
        
        this.userDefinedLenght = read.nextInt();
        
        return userDefinedLenght;
    }

    public int getUserDefinedLenght() 
    {
        return userDefinedLenght;
    }
    
    
}
