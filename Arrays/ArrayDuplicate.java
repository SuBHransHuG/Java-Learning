import java.util.ArrayList;
import java.util.HashSet;

class ArrayDuplicate {
    public static ArrayList<Integer> duplicates(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        HashSet<Integer> seen = new HashSet<Integer>();
        HashSet<Integer> added = new HashSet<Integer>();
        
        for (int i = 0; i < n; i++) {
            if (seen.contains(arr[i])) {
                if (!added.contains(arr[i])) {
                    duplicates.add(arr[i]);
                    added.add(arr[i]);
                }
            } else {
                seen.add(arr[i]);
            }
        }
        
        if (duplicates.size() == 0) {
            duplicates.add(-1);
        }
        
        return duplicates;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 4, 5};
        System.out.println(duplicates(arr));  // Output: [2, 3]
    }
}
