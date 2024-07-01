public class searchArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int x = 3;
        int n = arr.length;
        System.out.println(search(arr,n,x));
    }
    static int search(int[] arr , int n,int x){
        if(n == 0)
            return-1;
        else if(arr[n-1]==x)
            return n-1;
        return (search(arr,n-1,x));
    }
}
