import java.util.ArrayList;
import java.util.Arrays;

public class PosNegArrange {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(4);
        arr.add(-2);
        arr.add(-1);
        arr.add(5);
        arr.add(0);
        arr.add(-5);
        arr.add(-3);
        arr.add(2);
        int[] arr1 = new int[arr.size()];
        int j =1;
        int k =0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                arr1[k]= arr.get(i);
                k = k+2;
            }
            else{
                arr1[j]= arr.get(i);
                j = j+2;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
