import java.util.Arrays;
import java.util.HashSet;

public class ZerosAtEnd {
    public static void main(String[] args) {

        int[] arr = {2,0,5,0,7,0};
        int n = arr.length;
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println("Array After sorting");
        System.out.println(Arrays.toString(arr));

    }
}
