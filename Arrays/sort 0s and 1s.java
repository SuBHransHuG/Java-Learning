// Naieve Approach
import java.util.Arrays;

public class A{
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1};
        int n = arr.length;
       int count0 = 0;
       int count1 = 0;
       int i = 0;
       while(i<n){
           if(arr[i]==0){
               count0++;
           } else if (arr[i]==1) {
               count1++;
           }
           i++;
       }
       i=0;
       while(count0>0){
           arr[i]=0;
           i++;
           count0--;
       }
        while(count1>0){
            arr[i]=1;
            i++;
            count1--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

// optimised Approach
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0};
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
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
