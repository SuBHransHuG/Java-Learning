import java.util.Arrays;

public class sortingNumber {
    public static void main(String[] args) {
        int n = 654321;
        int[] arr = integerToArray(n);
        System.out.println(STR."Integer to array: \{Arrays.toString(arr)}");
        Arrays.sort(arr);
        System.out.println(STR."Sorted array: \{Arrays.toString(arr)}");
        int num = arrayToInteger(arr);
        System.out.println(STR."Number: \{num}");
    }

    private static int arrayToInteger(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = result * 10 + i;
        }
        return result;
    }

    private static int[] integerToArray(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
}
