/**
 * Non_Repeating_Element
Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

Examples:
Input: {-1, 2, -1, 3, 0}
Output: 2

Input: {9, 4, 9, 6, 7, 4}
Output: 6
 */
public class Non_Repeating_Element {
    public static int nonRepeat(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean repeat=false;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    repeat=true;
                    break;
                }
            }
            if(!repeat){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[]={-1, 2, -1, 3, 0};
        System.out.println(nonRepeat(arr));
    }
}