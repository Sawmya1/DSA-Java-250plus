import java.util.* ;
import java.io.*; 
public class SortArray012
{
    public static void sort012(int[] nums)
    {
        int lo, mid, hi, temp;
        lo = 0;
        mid = 0;
        hi = nums.length-1;
        while(mid<=hi){
            switch(nums[mid]){
                case 0: {
                    temp=nums[lo];
                    nums[lo]=nums[mid];
                    nums[mid]=temp;
                    lo++;
                    mid++;
                    break;
                    }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp=nums[mid];
                    nums[mid]=nums[hi];
                    nums[hi]=temp;
                    hi--;
                    break;
                    }
            }
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={0,2,1,2,0,0,0,1};
        sort012(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
