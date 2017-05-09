package algo.linearsearch;

/**
 * Created by Family on 2/28/2017.
 */
public class LinearSearch {

    int[] array = new int[128];
    int x;

    public LinearSearch(int[] array, int x) {
        this.array = array;
        this.x = x;
    }

    public int search(int[] array, int x){
        int value = 0;

        for(int i = 0; i < array.length; i++) { //big O(n)
            if (array[i] == x) {
                return i;
            }
        }
        return -1;

    }
}
