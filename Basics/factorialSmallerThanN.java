import java.util.Scanner;

static void fact(int n) {
    int factorial = 1;
    int count = 1;
    while (factorial < n) {
        count++;
        factorial *= count;
        System.out.println(count - 1);
    }
}

public static void main() {
    int n;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter number: ");
        n = scanner.nextInt();
    }

    fact(n);
}
