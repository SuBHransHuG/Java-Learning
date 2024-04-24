import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryAndResource {
    public static void main(String[] args) throws IOException {
        //        try {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            String str = br.readLine();
//            System.out.println(str);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            br.close();
//        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            System.out.println(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
