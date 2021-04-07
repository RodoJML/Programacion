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
            System.out.print("\n");
            System.out.println("_________________________________________________________________\n");
            
            switch(menu)
            {
                case 1:
                    x.problemApp1();
                    break;
                case 2:
                    x.problemApp2();
                    break;
            }
        }
    }
    
    public void problemApp1()           // Executes the first option of main menu.
    {
        char currency = '?';
        
        System.out.println("=== [ Exchange Rate Application ] ===");
        System.out.println("    1USD: 500CRC | 1EUR: 765CRC    \n");
        System.out.println("Please select currency");
        System.out.print("From (1)USD (2)EURO (3)CRC: ");
        a.setCurrencyFrom(read.nextByte());
        System.out.print("To   (1)USD (2)EURO (3)CRC: ");
        a.setCurrencyTo(read.nextByte());
        System.out.print("Please enter the total amount you want to convert: ");
        a.setUserUnits(read.nextFloat());
        
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
        System.out.print("Your exchange rate is: " + currency);
        System.out.printf("%f", a.conversion());
        System.out.println("\n");
        System.out.println("_________________________________________________________________\n");
    }
    
    public void problemApp2()
    {
        char currency = '?';
        
        System.out.println("=== [ Exchange Rate Application ] ===");
        System.out.println("*For this application user can define up to 2 currencies.");
        System.out.println("*Value for each currency must be expressed in Costarican colon.\n");
        
        System.out.println("Currency 1");
        System.out.print("Please set name : ");
        b.setCurrency0name(read.next());
        System.out.print("Please set value: ");
        b.setCurrency0value(read.nextFloat());
        System.out.print("\n");
        System.out.println("Currency 2");
        System.out.print("Please set name : ");
        b.setCurrency1name(read.next());
        System.out.print("Please set value: ");
        b.setCurrency1value(read.nextFloat());
        System.out.print("\n");
        
        System.out.println("Starting conversion...");
        System.out.println("Please select currency: ");
        System.out.print("From (1)" + b.getCurrency0name() + " (2)" + b.getCurrency1name() + " (3)CRC: ");
        b.setCurrencyFrom(read.nextByte());
        System.out.print("To   (1)" + b.getCurrency0name() + " (2)" + b.getCurrency1name() + " (3)CRC: ");
        b.setCurrencyTo(read.nextByte());
        
        System.out.print("Please enter the total amount you want to convert: ");
        b.setUserUnits(read.nextFloat());
        
        switch((int)b.getCurrencyTo())  //Casting applied here
        {
            case 1:
                currency = b.getCurrency0name().charAt(0);
                break;
            case 2:
                currency = b.getCurrency1name().charAt(0);
                break;
            case 3:
                currency = '₡';
                break;
        }
        
        System.out.print("Your exchange rate is: " + currency);
        System.out.printf("%f", b.conversion());
        System.out.println("\n");
        System.out.println("_________________________________________________________________\n");
    }
}