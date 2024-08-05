import java.util.*;
public class CheckSorted {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!(m.containsKey(arr[i]))){
                m.put(arr[i],1);
                a.add(arr[i]);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,8,5,7,2,9,5};
        ArrayList<Integer> a=removeDuplicate(arr);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
    }
}
