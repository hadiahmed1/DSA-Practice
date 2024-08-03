import java.util.*;
public class Aaa {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minI=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minI]){
                    minI=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minI];
            arr[minI]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={-4,7,-2,6,9,-1,0,6,2,-5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
