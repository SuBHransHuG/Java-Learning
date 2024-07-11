import java.util.ArrayList;

public class InsertionInMaxHeap {
    public static void main(String[] args) {
        Integer[] arr = {10, 9, 8, 6, 5, 2, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }

        Integer x = 20;
        arrayList.add(x);
        System.out.println("Before insertion: " + arrayList);

        int i = arrayList.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (arrayList.get(i) > arrayList.get(parent)) {
                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(parent));
                arrayList.set(parent, temp);
                i = parent;
            } else {
                break;
            }
        }

        System.out.println("After insertion: " + arrayList);
    }
}
