/*
Bingu was testing all the strings he had at his place and found that most of them were prone to a vicious attack by Banju, his arch-enemy. Bingu decided to encrypt all the strings he had, by the following method. Every substring of identical letters is replaced by a single instance of that letter followed by the number of occurrences of that letter. Then, the string thus obtained is further encrypted by reversing it.

Example 1:

Input:
s = "aabc"
Output: 1c1b2a
Explanation: aabc
Step1: a2b1c1
Step2: 1c1b2a
Example 2:

Input:
s = "aaaaa"
Output: 5a
Explanation: aaaaa
Step 1: a5
Step 2: 5a
Your Task:
You don't need to read input or print anything.Your task is to complete the function encryptString() which takes a single argument(s) and returns the encrypted string.

Expected Time Complexity: O(|s|).
Expected Auxiliary Space: O(|s|).

Constraints
1 <= |s| <=1000

|s| denotes the length of the string s
 */
public class EncryptString {
    String encryptString(String s) 
    {
        StringBuilder sb=new StringBuilder("");
        int count=0;
        char c=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count ++;
            }else{
                sb.append(c);
                sb.append(Integer.toString(count));
                c=s.charAt(i);
                count=1;
            }
        }
        sb.append(c);
        sb.append(Integer.toString(count));
        sb.reverse();
        return sb.toString();
        
    }
}
