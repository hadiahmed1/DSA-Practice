/*
 * Given an array of integers arr[] of size N and an integer d, the task is to rotate the array elements to the left by d positions.

Examples:  

Input: 
N = 7, d = 2 ,arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: 3 4 5 6 7 1 2

Input: N = 7, d=2 , arr[] = {3, 4, 5, 6, 7, 1, 2},
Output: 5 6 7 1 2 3 4
 */
public class ArrayLeftRotate {
    public static int[] leftRotate(int[] arr,int d){
        d=d%arr.length;//for when d>n
        int[] temp=new int[arr.length];
        for(int i=d;i<arr.length;i++){
            temp[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            temp[arr.length-d+i]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 1, 2};
        int d = 2;
        int rotate[]=leftRotate(arr, d);
        for (int i : rotate) {
            System.out.print(i+", ");
        }
    }
}
