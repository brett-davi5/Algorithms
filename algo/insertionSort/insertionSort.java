package algo.insertionSort;

/**
 * Created by Family on 3/5/2017.
 */
public class insertionSort {

    public static void main(String[] args){

        int[] myArray = insertionSort(new int[] {9, 8, 3, 13, 87, 12, 99, 8});

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println(1%10 );

    }


    public static int[] insertionSort(int[] a){

        for(int i = 0; i < a.length; i++){
            int element = a[i];
            int j = i - 1;

            while( j >= 0 && a[j] > element){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = element;
        }

        return a;

    }


}
