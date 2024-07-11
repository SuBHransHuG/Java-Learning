public class MaxHeap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n = arr.length;
//        p-c =left= 2i+1
//        p-c =right= 2i+2
        int parentLeft =0;
        int parentRight =0;
        for(int i = 0 ;i<n;i++){

            parentLeft = 2*i+1;
            parentRight = 2*i+2;
            if(parentLeft<n ){
            if(arr[i]<arr[parentLeft] && arr[i]<arr[parentRight]){
                System.out.println(false);
                break;
            }
            }
        }
    }
}
