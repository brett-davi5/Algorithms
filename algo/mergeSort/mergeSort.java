package algo.mergeSort;

/**
 * Created by Family on 3/12/2017.
 */
public class mergeSort {

    public static void main(String[] args){

        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        mergeSort(inputArray, 0, inputArray.length-1);

        for(int i = 0; i < inputArray.length; i++){
            System.out.print(inputArray[i] +  " ");
        }

        System.out.println(" ");

        System.out.println("Division Test: When 15 / 2 = " + (15/2));
        System.out.println("Division Test: When 21 / 2 = " + (21/2));


    }

    public static int[] mergeSort(int[] array, int low, int high){

        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(array, low, mid); //sorting the left side
            mergeSort(array, mid + 1, high); //sorting the right side
            merge(array, low, mid, high);
        }
        return array;

    }

    public static int[] merge(int[] array, int low, int mid, int high){

        int[] tempArray = new int[high - low + 1];


        //here are the index counters
        int leftPoint = low;
        int rightPoint = mid + 1;
        int k = 0;


        //
        while(leftPoint <= mid && rightPoint <= high){
            if(array[leftPoint] < array[rightPoint]){
                tempArray[k] = array[leftPoint];
                leftPoint = leftPoint + 1;
            }else{
                tempArray[k] = array[rightPoint];
                rightPoint = rightPoint + 1;
            }

            k = k + 1;
        }

        //at this point, the above loop is completed.
        //Both the left and right sides of the sub array can be considered sorted
        //be aware that if the left or right slot exceeds the mid or high (see the while loop conditions)
        //this means we have some slots that are still not sorted and we need to fill those in
        //this is why we use the if/else if statements below


        if(leftPoint <= mid){ //if the right side is done being sorted, the left must still be sorted
            while(leftPoint <= mid){
                tempArray[k] = array[leftPoint];
                leftPoint = leftPoint + 1;
                k = k + 1;
            }
        }else if(rightPoint <= high){ //if the left side is sorted, the right must be still be sorted
            while(rightPoint <= high){
                tempArray[k] = array[rightPoint];
                rightPoint = rightPoint + 1;
                k = k + 1;
            }
        }


        for(int i = 0; i < tempArray.length; i++){
            array[low + i] = tempArray[i];
        }

        return array;
    }


}
