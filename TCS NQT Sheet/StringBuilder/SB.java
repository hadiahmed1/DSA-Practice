import java.util.*;
class SB{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hadi Ahmed");
        for(int i=0;i<sb.length();i++){
            System.out.print("\""+sb.charAt(i)+"\" ,");
        }
        sb.setCharAt(3, 'I');
        sb.insert(0, "Mr. ");
        sb.insert(8, "iii");
        sb.delete(7,8);
        sb.append(" is 21 yo");
        sb.append('a');
        
        sb.toString();
        System.out.println(sb);
        System.out.println(sb.lastIndexOf(String.valueOf('i')));
    }
}