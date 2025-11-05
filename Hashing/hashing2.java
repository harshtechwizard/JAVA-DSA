import java.util.Map;

public class hashing2 {
    // Frequency count using hashmap
    public static void main(String[] args) {
        String s ="harsh";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), null)+1 );
        }
    }
}
