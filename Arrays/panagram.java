import java.util.HashSet;

public class panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ch>='A' && ch<='Z'){
                hs.add(Character.toLowerCase(ch));
            }
            else if(ch>='a' && ch<='z'){
                hs.add(ch);
            }
            else{
                continue;
            }
        }
        if(hs.size() == 26){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
