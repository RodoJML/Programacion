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
    private int arrayLenght;
    private int[] array = new int[arrayLenght];

    public void setArrayUnsorted(int arrayUnsorted) 
    {
        this.arrayUnsorted = arrayUnsorted;
    }
   
    public void sort()
    {
        converToArray();
        System.out.println(array);
    }
    
    
    private void converToArray()                                    // Hidding as seen in class since user does not need to know about this
    {
        int indexStart;
        int indexMiddle;
        int indexEnd;
        int arrayUnsorted0 = this.arrayUnsorted;
        int arrayUnsorted1 = arrayUnsorted0;
        
        for(arrayLenght = 0; arrayUnsorted0 != 0; arrayLenght++)    // Diving any number by 10, multiple times until reaching 0
            arrayUnsorted0 = (arrayUnsorted0 / 10);                   // will provide you the amount of digits on that string of number. 
     
        int[] array = new int[arrayLenght];
        
        for(int index = 0; arrayUnsorted1 != 0; index++)
        {
            array[index] = (arrayUnsorted1 % 10);
            arrayUnsorted1 = (arrayUnsorted1 / 10);
        }
        
        this.array = array;
        
        indexStart = 0;
        indexEnd = arrayLenght;
        
        mergeSort(array, indexStart, indexEnd);                     // Initiate the merge Sort!                      
    }
        
    private void mergeSort(int array[], int start, int end)
    {
        if(start >= end)   // <--------------------------------     // Any recursive function must have a base case, otherwise it'll run forever
            return;                                                 // If at some point the start of the array is greater or iqual than its end, stop!
        
        int middle =  (start + end) / 2;                              // Define the middle point index of the handed array.
        
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
        
        merge(array, start, end);
    }
    
    private void merge(int array[], int start, int end)
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
        
        while(indexStart1 <= end)
            temporaryArray[indexNew++] = array[indexStart1++];
        
        for(int i = start; i <= end; i++)                           // Passing the temporary sorted array to the main array.
        {                                                           
            temporaryArray[i] = array[i]; 
        }
    }
}
