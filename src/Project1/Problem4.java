/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */

public class Problem4 
{
    private long arrayUnsorted;
    private int arrayLenght;
    private int targetNumber;                                       // This is the number that the user wants to lookup in the now sorted array
    private long[] array = new long[arrayLenght];
    

    public void setArrayUnsorted(long arrayUnsorted) 
    {
        this.arrayUnsorted = arrayUnsorted;
    }

    public void setTargetNumber(int targetNumber) 
    {
        this.targetNumber = targetNumber;
    }

    public int getTargetNumber()
    {
        return targetNumber;
    }

    public int getArrayLenght()
    {
        return arrayLenght;
    }

    public long getArrayUnsorted()
    {
        return arrayUnsorted;
    }
    
    public long[] sort(long arrayUnsorted)
    {
        converToArray(arrayUnsorted);
        return array;
    }
    
    
    private void converToArray(long arrayUnsorted)                                    // Hidding as seen in class since user does not need to know about this
    {
        int indexStart;
        int indexEnd;
        long arrayUnsorted0 = arrayUnsorted;
        long arrayUnsorted1 = arrayUnsorted0;
        
        for(arrayLenght = 0; arrayUnsorted0 != 0; arrayLenght++)    // Diving any number by 10, multiple times until reaching 0
            arrayUnsorted0 = (arrayUnsorted0 / 10);                 // will provide you the amount of digits on that string of number. 
     
        long[] array = new long[arrayLenght];
        
        for(int index = 0; arrayUnsorted1 != 0; index++)
        {
            array[index] = (arrayUnsorted1 % 10);
            arrayUnsorted1 = (arrayUnsorted1 / 10);
        }
        
        this.array = array;
        
        indexStart = 0;
        indexEnd = arrayLenght - 1;
        
        mergeSort(array, indexStart, indexEnd);                     // Initiate the merge Sort!                      
    }
        
    private void mergeSort(long array[], int start, int end)
    {
        if(start >= end)   // <--------------------------------     // Any recursive function must have a base case, otherwise it'll run forever
            return;                                                 // If at some point the start of the array is greater or iqual than its end, stop!
        
        int middle =  (start + end) / 2;                            // Define the middle point index of the handed array.
        
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
        
        merge(array, start, end);
    }
    
    private void merge(long array[], int start, int end)
    {
        long[] temporaryArray = new long[arrayLenght];
                
        int indexMiddle = (start + end) / 2;
        int indexStart0 = start;                                    // Points at the first index of the array
        int indexStart1 = indexMiddle + 1;                          // Points at the first index of the second half of the array
        int indexNew    = start;                                    // This will be used for the new index of the new array 
        
        
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
        
        for(int i = start; i<= end; i++)
        {
            array[i] = temporaryArray[i];
        }
        this.array = array;
    }
    
    public void binarySearch(long sortedArray[], int target, int start, int end)
    {
        int middle = (start + end) / 2;
        
        if(start > end || end < start)
        {
            System.out.println("Result: Not Found! :( - Number " + target + " is not on the original array.");
            return;
        }
        
        if(sortedArray[middle] == target)
        {
            System.out.println("Result: Found! :) - Number " + target + " is on the original array.");
        }
        else
            if(sortedArray[middle] < target)
            {
                start = middle + 1;
                binarySearch(sortedArray, target, start, end);
            }
            
        if(sortedArray[middle] > target)
            {
                end = middle - 1;
                binarySearch(sortedArray, target, start, end);
            }
    }
}
