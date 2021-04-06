/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;
import java.util.Scanner;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class Launcher
{
    Scanner read = new Scanner(System.in);
    Problem1 a = new Problem1();        // Instance the first object called "a"
    Problem2 b = new Problem2();        // Instance the second object called "b"
    
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        while(true)
        {
            int menu = 0;
            Launcher x = new Launcher();
            
            System.out.println("=== [ Main Menu ] ===\n");
            System.out.println("Options: \n(1) Problem 1: Exchange Rate - Fixed currency\n(2) Problem 2: Exchange Rate - User defines currency");
            System.out.print("Please select the problem of the project you want to run: ");
            menu = read.nextInt();
            System.out.println("____________________________________________________________\n");
            
            switch(menu)
            {
                case 1:
                    x.problemApp1();
                    break;
                case 2:    
                
            }
        }
    }
    
    public void problemApp1()           // Executes the first option of main menu.
    {
        char currency = 0;
        
        System.out.println("=== [ Exchange Rate Application ] ===");
        System.out.println("    1USD: 500CRC | 1EUR: 765CRC    \n");
        System.out.println("Please select currency");
        System.out.print("From (1)USD (2)EURO (3)CRC: ");
        a.setCurrencyFrom(read.nextByte());
        System.out.print("To   (1)USD (2)EURO (3)CRC: ");
        a.setCurrencyTo(read.nextByte());
        System.out.print("Please enter the total amount you want to convert: ");
        a.setUserUnits(read.nextInt());
        
        switch((int)a.getCurrencyTo())  //Casting applied here
        {
            case 1:
                currency = '$';
                break;
            case 2:
                currency = '€';
                break;
            case 3:
                currency = '₡';
                break;
        }
        System.out.println("Your exchange rate is: " + currency + a.conversion() + "\n");
        System.out.println("____________________________________________________________\n");
    }
    
    public void problemApp2()
    {
        System.out.println("=== [ Exchange Rate Application ] ===");
        System.out.println("For this application user defines the name for up to 2 currencies, value for each currency must be expressed in Costarican colon\n");
        System.out.println("Please name your new currency 1: ");
        b.setCurrency0(read.next());
        System.out.println("Please name your new currency 2: ");
        b.setCurrency1(read.next());
        
        
    }
}