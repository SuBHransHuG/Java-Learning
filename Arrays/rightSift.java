import java.util.Arrays;

public class rightSift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int d =2;
        while(d>0){
            int a = arr[n-1];
            for (int i = n-1; i > 0; i--) {
                arr[i]=arr[i-1];
            }
            arr[0] = a;
            d--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
