import java.util.* ;
import java.io.*; 

public class MaxSubarrayKadane {  
    public static long maxSubarraySum(int[] nums, int n) {
        long maxi=nums[0], sum=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum<0)  sum=0;
            if(maxi<sum)  maxi=sum;
        }
        return maxi;
    }
    public static void main(String args[])
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int lon=maxSubArray(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}