import java.util.Arrays;
import java.lang.Math;

public class Sorter
{

    public static int[] bubbleSort(int[] initArray)
    {
        
        for(int j = 0; j < initArray.length - 1; j++) 
        {
           // for(int j = initArray.length; j > i; j--)
           for(int i = 0; i < initArray.length - 1 - j; i++)
            {
                if(initArray[i] > initArray[i+1])
                {
                    int tempInt = initArray[i];
                    initArray[i] = initArray[i+1];
                    initArray[i+1] = tempInt;
                   // System.out.println(Arrays.toString(initArray));
                }
            }
        }
        
     return initArray;
    }   
    
    public static int[] selectionSort(int[] initArray)
    {
        int length = initArray.length;
        for( int compVal = 0, lowIndex = 0, i = 0; i < Math.ceil(length/2) ; i++)
        {
        
            compVal = initArray[i];
           // int compVal = initArray[i];   
           // int lowIndex = 0;
       // System.out.println("compval " +compVal);
        for ( int j = i+1 ; j < initArray.length; )
        {
            
            if( compVal > initArray[j])
            {
                compVal = initArray[j];
                lowIndex = j;
                System.out.println( "i=" +i+ " j="+ j+" CV " +compVal + " LI " +  lowIndex );
                System.out.println(Arrays.toString(initArray));
                j++;
            }
            else
            {
                j++;
                System.out.println( "i=" +i+ " j="+ j+" CV " +compVal + " LI " +  lowIndex );

            }

        }
            initArray[lowIndex] = initArray[i];
            initArray[i] = compVal; 
            System.out.println(Arrays.toString(initArray));

        }
        return initArray;
    }
/*
    public static int[] insertionSort(int[] initArray)
    {

    }
*/


public static void main(String[] args)                                          
   {                                                                               
       int[] testArray = new int[]{11,10,9,8,7,6,5,4,3,2,1};
       //is there better way to do this. 
       int[] printArray = new int[testArray.length];
       printArray = bubbleSort(testArray);
       System.out.println("bubble sortu "+  Arrays.toString(printArray));                          
       testArray = new int[]{11,10,9,8,7,6,5,4,3,2,1};
       System.out.println("testArray " + Arrays.toString(testArray));
      
       //is there better way to do this. 
       //int[] printArray = new int[10];
       printArray = selectionSort(testArray);
       System.out.println("selection sortu "+  Arrays.toString(printArray)); 
  /* 
        int[] testArray = new int[]{10,9,8,7,6,5,4,3,2,1};
       //is there better way to do this. 
       int[] printArray = new int[10];
       printArray = bubbleSort(testArray);
       System.out.println("bubble sortu "+  Arrays.toString(printArray));   
   */
   }


}
