public class MaxSum {
    static int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    static int sum(int arr[],int i,int s){
        if(arr.length==0){
            return arr[0];
        }
        else if(i>arr.length-3){
            return s+0;
        }else if(i==arr.length-3){
            return s+arr[i+2];
        }

        int s1=sum(arr,i+2,s+arr[i+2]);
        int s2=sum(arr,i+3,s+arr[i+3]);
        return (max(s1,s2));
    }
    static int findMaxSum(int arr[], int n) {
        // code here
        if(n==0) return 0;
        if(n==1) return arr[0];
        if(n==2) return max(arr[0],arr[1]);
        int v1=arr[0];
        int v2=max(v1,arr[1]);
        int m=v2;
        for(int i=2;i<n;i++){
            m=max(v1+arr[i],v2);
            v1=v2;
            v2=m;
        }
        
        return m;
    }
    public static void main(String[] args) {
        int arr[]={3,2,7,10};
        int s=sum(arr, -2, 0);
        System.out.println("\ns="+s);
    }
}
