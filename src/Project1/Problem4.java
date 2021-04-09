/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author rodo
 */

public class Problem4 
{
    private int arrayUnsorted;
    private int arraySorted;
    private int arrayLenght;
    int[] array = new int[arrayLenght];
    
    public void converToArray()
    {
        int indexStart;
        int indexMiddle;
        int indexEnd;
        int arrayUnsorted0 = this.arrayUnsorted;
        int arrayUnsorted1 = this.arrayUnsorted;
        
        for(arrayLenght = 0; arrayUnsorted0 != 0; arrayLenght++)    // Diving any number by 10, multiple times until reaching 0
            arrayUnsorted0 = arrayUnsorted0 / 10;                   // will provide you the amount of digits on that string of number. 
     
        for(int index = 0; arrayUnsorted1 != 0; index++)
        {
            array[index] = arrayUnsorted1 % 10;
            arrayUnsorted1 = arrayUnsorted1 / 10;
        }
        
        indexStart = 0;
        indexEnd = arrayLenght - 1;
    }
    
    public void mergeSort(int array[], int start, int end)
    {
        if(start >= end)   // <--------------------------------     // Any recursive function must have a base case, otherwise it'll run forever
            return;                                                 // If at some point the start of the array is greater or iqual than its end, stop!
        
        int middle =  start + end / 2;                              // Define the middle point index of the handed array.
        
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
    }
    
    public void merge(int array[], int start, int end)
    {
        int[] temporaryArray = new int[arrayLenght];
                
        int indexMiddle = (start + end) / 2;
        int indexStart0 = start;                                    // Points at the first index of the array
        int indexStart1 = indexMiddle + 1;                          // Points at the first index of the second half of the array
        int indexNew = start;                                       // This will be used for the new index of the new array 
        
        
        while(indexStart0 <= indexMiddle && indexStart1 <= end)
        {
            if(array[indexStart0] < array[indexStart1])             // We compare the first number of the array vs the first number of the second half array
                temporaryArray[indexNew++] = array[indexStart0++];
            else
                temporaryArray[indexNew++] = array[indexStart1++];
        }
        
        while(indexStart0 <= indexMiddle)
            temporaryArray[indexNew++] = array[indexStart0++];
        
        while(indexStart1 <= indexMiddle)
            temporaryArray[indexNew++] = array[indexStart1++];
        
        
    }
            
  
    
    
}
