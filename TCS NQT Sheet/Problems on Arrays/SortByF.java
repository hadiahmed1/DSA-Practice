/*
Sorting Elements of an Array by Frequency
Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.

Constraints:
1 ≤ T ≤ 70
1 ≤ N ≤ 130
1 ≤ Ai ≤ 60 

Example:
Input:
2
5
5 5 4 6 4
5
9 9 9 2 5

Output:
4 4 5 5 6
9 9 9 2 5

Explanation:
Testcase1: The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are same then smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6.
The output is 4 4 5 5 6.

Testcase2: The highest frequency here is 3. The element 9 has the highest frequency. So 9 9 9 comes first. Now both 2 and 5 have same frequency. So we print smaller element first.
The output is 9 9 9 2 5.
*/ 
import java.util.*;
import java.lang.*;
import java.io.*;
public class SortByF {
    static int[] removeDuplicate(int arr[]){
        List al = Arrays.asList(arr);
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i).equals(al.get(i+1))){
                al.remove(i+1);
            }
            
        }


    }
    static int[] sortFrequency(int[] arr, int n){
        Arrays.sort(arr);
        Map<Integer, Integer> m=new HashMap<>();
        for (int i : arr) {
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        return arr;
    }
	public static void main (String[] args) {
		//code
	}
}
