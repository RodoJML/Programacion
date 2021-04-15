/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class Problem5
{
    Problem4 d = new Problem4();
    Scanner read = new Scanner(System.in);
    
    String longString0;
    String longString1; 
    String longString2;
    long unsortedString;
    
    public void setValues()
    {
        System.out.print("(1) Please enter a string of numbers: ");
        longString0 = read.next();
        
        System.out.print("(2) Please enter a string of numbers: ");
        longString1 = read.next();
        
        this.longString2 = longString0 + longString1;
        this.unsortedString = Long.parseLong(longString2);
    }

    public long getUnsortedString() 
    {
        return unsortedString;
    }
    
    public void mergeAndSort(long X)
    {
        System.out.print(Arrays.toString(d.sort(X)));
    }
    
}
