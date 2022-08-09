import java.util.* ;
import java.io.*; 
public class CountInversion {
    static long merge(long arr[], long temp[], int left, int mid, int right){
        long inv_count=0;
        int i=left, j=mid, k=left;
        while((i<=mid-1)&&(j<=right)){
            if(arr[i]<=arr[j])
                temp[k++]=arr[i++];
            else{
                temp[k++]=arr[j++];
                inv_count=inv_count+(mid-i); //count+(3-1)i.e.2
            }
        }
        while(i<=mid-1)
            temp[k++]=arr[i++];
        while(j<=right)
            temp[k++]=arr[j++];
        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];
       //wapas value dalo array mai
        return inv_count;      
    }
    static long mergeSort(long arr[], long temp[], int left, int right){
        long inv_count=0;
        int mid;
        if(right>left){
            mid=(right+left)/2;
            inv_count += mergeSort(arr,temp,left,mid);
            inv_count += mergeSort(arr,temp,mid+1,right);
            
            inv_count += merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }
    public static long getInversions(long arr[], int n) {
        long temp[] = new long[n]; 
        long ans = mergeSort(arr, temp, 0, n-1);
        return ans;
    }
}