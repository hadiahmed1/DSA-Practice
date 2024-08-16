/**
 * RemoveCharacter
 * Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
Example 1:
Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:
Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
 */
public class RemoveCharacter {
    static boolean isInString(char c, String s){
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i)){
                return true;
            }
        }
        
        return false;
    }
    static String removeChars(String s1, String s2){
        StringBuilder sb=new StringBuilder(s1);
        for(int i=0; i<sb.length();i++){
            try{
                while(isInString(sb.charAt(i), s2)){
                    sb.deleteCharAt(i);
                }
            }catch(Exception e){}
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeChars("Armaniac","arm"));
    }
}