import java.util.*;
public class RemoveDuplicateChar {
    String removeDuplicates(String str) {
        Map<Character,Boolean> m=new HashMap<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!m.containsKey(c)){
                sb.append(c);
                m.put(c,true);
            }
        }
        return sb.toString();
    }

}
