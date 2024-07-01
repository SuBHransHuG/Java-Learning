public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        System.out.println(sum(arr,n));
    }
    static int sum(int[] arr,int n){
        if(n <= 0){
            return 0;
        }
       return(sum(arr,n-1)+arr[n-1]);
    }
}
