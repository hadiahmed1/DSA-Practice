import java.util.*;
public class IsSubset {
    public static String isSubset( long a1[], long a2[], long n, long m1) {
        Map<Long,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!m.containsKey(a1[i])){
                m.put(a1[i],1);
            }else{
                m.put(a1[i],m.get(a1[i])+1);
            }
        }
        for(int i=0;i<m1;i++){
            if(!m.containsKey(a2[i])){
                return "No";
            }else{
                m.put(a2[i],m.get(a2[i])-1);
                if(m.get(a2[i])==0){
                    m.remove(a2[i]);
                }
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        long a1[]={3,8,1,9,4,0,2,1,6};
        long a2[]={1,2,3,1};
        System.out.println(isSubset(a1,a2,a1.length,a2.length));
    }
}
