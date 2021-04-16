/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class Launcher
{
    Scanner     read = new Scanner(System.in);
    Problem1    a    = new Problem1();        // Instance the first object called "a"
    Problem2    b    = new Problem2();        // Instance the second object called "b"
    Rectangle   c0   = new Rectangle();
    Oval        c1   = new Oval();
    Problem4    d    = new Problem4();        // Instance the fourth object called "d"
    Problem5    e    = new Problem5();
    
    
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
       
        while(true)
        {
            int menu = 0;
            Launcher x = new Launcher();
            
            System.out.println("=== [ Main Menu ] ===");
            System.out.println("Universidad Latina de Costa Rica");
            System.out.println("BIS03 Programación I para TI, Final Project I");
            System.out.println("Professor: Carlos Mendez Rodriguez || Student: Rodolfo Javier Meneses Leal\n");
            
            System.out.println("Options: \n(1) Problem 1: Exchange Rate - Fixed currency\n(2) Problem 2: Exchange Rate - User defines currency"
                               + "\n(3) Problem 3: Draw Figures\n(4) Problem 4: Binary Search\n(5) Problem 5: Merge");
            System.out.print("\nPlease select the problem of the project you want to run: ");
            menu = read.nextInt();
            System.out.print("\n");
            System.out.println("___________________________________________________________________________\n");
            
            switch(menu)
            {
                case 1:
                    x.problemApp1();
                    break;
                case 2:
                    x.problemApp2();
                    break;
                case 3:
                    x.problemApp3();
                    break;
                case 4:
                    x.problemApp4();
                    break;
                case 5:
                    x.problemApp5();
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
        System.out.println("___________________________________________________________________________\n");
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
        System.out.println("___________________________________________________________________________\n");
    }
    
    public void problemApp4()
    {        
        System.out.println("=== [ Binary Search ] ===");
        System.out.println("On this application the user can enter any string of numbers up\n"
                            + "to 18 digits, afterwards, the user can lookup for any number\n"
                            + "to validate if it's included within the original array.\n");
        
        System.out.print("Please enter a string of numbers: ");
        d.setArrayUnsorted(read.nextLong());
        
        System.out.print("Please enter a number to lookup: ");
        d.setTargetNumber(read.nextInt());
        System.out.print("\n");
        
        d.binarySearch(d.sort(d.getArrayUnsorted()), d.getTargetNumber(), 0, d.getArrayLenght());
        
        System.out.print("By the way here's your array sorted " + Arrays.toString(d.sort(d.getArrayUnsorted())));
        System.out.println("\n");
        System.out.println("___________________________________________________________________________\n");
    }
    
    public void problemApp5()
    {
        System.out.println("=== [ Merge ] ===");
        System.out.println("On this application the user can enter 2 separate strings of numbers\n"
                            + "up to 9 digits each, afterwards the application will merge and sort\n"
                            + "the two strings into one.\n");
        e.setValues();
        
        System.out.println("\nHere are your 2 strings merged and sorted");
        System.out.print("Result: ");
        e.mergeAndSort(e.getUnsortedString());
        System.out.println("\n");
        System.out.println("___________________________________________________________________________\n");
    }
    
    public void problemApp3()
    {
        int option;
        
        JFrame window = new JFrame("Window for Drawings - BIS03 Final Project I Ulatina");
   
        System.out.println("=== [ Drawing ] ===");
        System.out.println("Draw rectangles or ovals on screen, with user defined with\n"
                            + "size and position on screen, between (640x480) pixels\n");
        
        System.out.println("Options:");
        System.out.println("(1) Rectangle");
        System.out.println("(2) Oval");
        
        System.out.print("\nWhat figure you want to draw?: ");
        option = read.nextInt();
        
        switch(option)
        {
            case 1: 
            {
                int otherDrawing = 1;
                while(otherDrawing == 1)
                {
                System.out.print("(X) Horizontal position: ");
                c0.setPositionX(read.nextInt());
        
                System.out.print("(Y) Vertical position: ");
                c0.setPositionY(read.nextInt());
        
                System.out.print("(X) Width: ");
                c0.setSizeX(read.nextInt());
        
                System.out.print("(Y) Height: ");
                c0.setSizeY(read.nextInt());
        
                window.add(c0);
                window.setSize(640, 480);
                window.setVisible(true);
                
                System.out.print("\nDo you want to draw another rectangle? (1) Yes (0) No: ");
                otherDrawing = read.nextInt();
                System.out.print("\n");
                window.setVisible(false);
                if (otherDrawing == 0)
                    System.out.println("___________________________________________________________________________\n");
                }
                break;
            }
            
            case 2:
            {
                int otherDrawing = 1;
                while(otherDrawing == 1)
                {
                System.out.print("(X) Horizontal position: ");
                c1.setPositionX(read.nextInt());
        
                System.out.print("(Y) Vertical position: ");
                c1.setPositionY(read.nextInt());
        
                System.out.print("(X) Width: ");
                c1.setSizeX(read.nextInt());
        
                System.out.print("(Y) Height: ");
                c1.setSizeY(read.nextInt());
        
                window.add(c1);
                window.setSize(640, 480);
                window.setVisible(true);
                
                System.out.print("\nDo you want to draw another oval? (1) Yes (0) No: ");
                otherDrawing = read.nextInt();
                System.out.print("\n");
                window.setVisible(false);
                if (otherDrawing == 0)
                    System.out.println("___________________________________________________________________________\n");
                }
                break;
            }
            
        }

    }
}