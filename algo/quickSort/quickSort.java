package algo.quickSort;

import java.util.Arrays;

/**
 * Created by Family on 3/13/2017.
 */
public class quickSort {

    public static void main(String[] args){

        int[] inputArray = { 12, 81, 74, 43, 1098, 0, 8};
        quickSort(inputArray, 0, inputArray.length-1);

        System.out.println(Arrays.toString(inputArray));

    }

    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int partitionPoint = partition(array, low, high); //this gives us the position of the correctly placed
            //pivot value
            quickSort(array, low, partitionPoint - 1); //sorts the left half
            quickSort(array, partitionPoint + 1, high); //sorts the right half

        }
    }


    public static int partition(int[] array, int low, int high){

        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j <= high-1; j++){
            if(array[j] <= pivot){
                i = i + 1;
                //now we're swapping values
                int iValue = array[i];
                int jValue = array[j];
                array[i] = jValue;
                array[j] = iValue;
            }
        }

        //now we need to pivot the value in the correct slot
        int iValue = array[i + 1];
        array[high] = iValue;
        array[i + 1] = pivot; //here, the pivot value is actually placed in the correct position

        return i + 1;
    }
}
