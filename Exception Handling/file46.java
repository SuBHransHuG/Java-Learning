// A Class that represents user-defined exception

import java.util.Scanner;

class SubhException extends Exception {
    public SubhException(String s)
    {
        super(s);
    }
}
public class file46 {
    // Driver Program
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        try {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
            if(b == 0){
            throw new SubhException("divide By zero exception");
        }
            else {
                System.out.println("Value = "+a/b);
            }
        }
        catch (SubhException ex) {
            System.out.println("Caught");

            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
