public class searchArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,3,4};
        int x = 3;
        int n = arr.length;
        System.out.println(search(arr,0,n,x));
    }
    static int search(int[] arr ,int index, int n,int x){
        if(n == index)
            return-1;
        else if(arr[index]==x)
            return index;

        return (search(arr,index+1,n,x));
    }
}
