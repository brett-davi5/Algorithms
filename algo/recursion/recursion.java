package algo.recursion;

/**
 * Created by Family on 3/3/2017.
 */
public class recursion {

    public static void main(String[] args) {

        //reduceByOne(3);

        System.out.println(recursiveLinearSearch(new int[] {4, 48, 4, 28, 34, 76, 9, 3}, 0, 48));


        System.out.println(recursiveBinarySearch(new int[] {4, 48, 4, 28, 34, 76, 9, 3}, 28, 0, 7));

    }

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n - 1);
        }

        System.out.println("Completed call: " + n);
    }

    public static int recursiveLinearSearch(int[] a, int i, int x) {

        if (i > a.length - 1){ //if evaluates to true, x was not found in the array
            return -1;
        }else if(a[i] ==x){ //if equal, return position i
            return i;
        }else{
            System.out.println("index at:" + i);
            return recursiveLinearSearch(a, i+1, x);
        }


    }


    public static int recursiveBinarySearch(int[] a, int x, int low, int high){
        int mid = 0;

        if( low > high){
            return -1;
        }else{
            mid = (low + high) / 2;
            if(a[mid] == x){
                return mid;
            }else if (a[mid] > x){
                return recursiveBinarySearch(a, x, low, mid-1);
            }else{
                return recursiveBinarySearch(a, x, mid+1, high);
            }
        }
    }

}
