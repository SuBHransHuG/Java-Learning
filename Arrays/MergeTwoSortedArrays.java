import java.util.Arrays;

public class MergeTwoSortedArrays {

    static void mergeArray(int[] arr1,int[] arr2,int n, int m){
        int[] arr3 = new int[n+m];
        int i =0;
        int j =0;
        int k =0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else {
                arr3[k++] = arr2[j++];
            }
        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while (j<m){
            arr3[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,9};
        int[] arr2 = {2,4,8,10};
        int n = arr1.length;
        int m = arr2.length;
        mergeArray(arr1,arr2,n,m);
    }
}
