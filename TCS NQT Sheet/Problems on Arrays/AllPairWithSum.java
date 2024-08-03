import java.util.*;
public class AllPairWithSum {
    public static pair[] allPairs(int x, int arr1[], int arr2[]) {
        pair[] p=new pair[arr1.length+arr2.length];
        int count=0;
        // Your code goes here
        Map<Integer,Integer> m=new HashMap<>();
        Arrays.sort(arr1);
        for(int i=0;i<arr2.length;i++){
            m.put(x-arr2[i],arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(m.containsKey(arr1[i])){
                p[count++]=new pair(arr1[i],x-arr1[i]);
            }
        }
        pair[] ret=new pair[count];
        for(int i=0;i<count;i++){
            ret[i]=p[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -4, 5};
        int[] arr2 = {6, 4, 1,-2,11};
        int x=7;
        pair[] p=allPairs(x,arr1,arr2);
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].first+" "+p[i].second);
        }
    }
}
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
