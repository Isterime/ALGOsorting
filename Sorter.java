import java.util.Arrays;


public class Sorter
{

    public static int[] bubbleSort(int[] initArray)
    {
        
        for(int i = 0; i < initArray.length - 1; i++) 
        {
            for(int j = initArray.length; j > i; j--)
            {
                if(initArray[i] > initArray[i+1])
                {
                    int tempInt = initArray[i];
                    initArray[i] = initArray[i+1];
                    initArray[i+1] = tempInt;
                    System.out.println(Arrays.toString(initArray));
                    i = 0;
                }
            }
        }
        
     return initArray;
    }   
  /*  public static int[] selectionSort(int[] initArray)
    {

    }

    public static int[] insertionSort(int[] initArray)
    {

    }
*/


public static void main(String[] args)                                          
   {                                                                               
       int[] testArray = new int[]{10,9,8,7,6,5,4,3,2,1};
       //is there better way to do this. 
       int[] printArray = new int[10];
       printArray = bubbleSort(testArray);
                                                                                   
       System.out.println("bubble sortu "+  Arrays.toString(printArray));                          
   }


}
