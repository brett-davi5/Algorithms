package algo.binarysearch;

/**
 * Created by Family on 2/28/2017.
 */
public class binarySearch {


    public static void main(String[] args){

        int[] testArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(testArray, 4));
    }

    public static int binarySearch(int[] array, int x){
        int low = 0;
        int high = array.length - 1;
        int mid;

        while(low <= high){
            mid = (low + high) / 2;
            if(x < array[mid])
                high = mid - 1;
            else if(x > array[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}