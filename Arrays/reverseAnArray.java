import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int low =0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
