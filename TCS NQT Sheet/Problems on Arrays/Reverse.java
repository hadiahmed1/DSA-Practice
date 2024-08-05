public class Reverse {
    public static String reverse(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=rev+str.charAt(str.length()-i-1);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hadi"));
    }
}
