/**
 * EqilibriumIndex
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
Given an array, your task is to find the index of first Equilibrium point in the array.
Input:1 2 0 3
Output:2
Input:1 1 1 1
Output:-1
 */
public class EqilibriumIndex {
    public static int findEquilibrium(int arr[], int n)
    {
        int r=0;
        for(int i=1;i<n;i++){
            r=r+arr[i];
        }
        int l=0;
        for(int i=0;i<n-1;i++){
            // System.out.println("i="+i+",r="+r+",l="+l);
            if(r==l){
                return i;
            }
            r=r-arr[i+1];
            l=l+arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,3};
        System.out.println("Eqi="+findEquilibrium(arr, arr.length));
    }
}