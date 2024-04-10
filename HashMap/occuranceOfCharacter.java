import java.util.HashMap;
import java.util.Map;

public class occuranceOfCharacter {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap= new HashMap<Character,Integer>();
        String inp = "Saurian";
        char[] strArr = inp.toCharArray();
        for(char c : strArr) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else {
                hashMap.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
