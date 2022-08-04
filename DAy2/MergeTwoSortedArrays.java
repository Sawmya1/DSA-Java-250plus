import java.util.* ;
import java.io.*; 
public class MergeTwoSortedArrays {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        for(int i=0; i<n; i++,m++){ //m++ num1 index inc
            arr1[m]=arr2[i];
        }
        Arrays.sort(arr1);
        return arr1;

//         int arr[] = new int[m+n];
//         int k=0;
//         for(int i=0;i<m;i++)
//             arr[k++]=arr1[i];
//         for(int i=0;i<m;i++)
//             arr[k++]=arr2[i];
//         Arrays.sort(arr);
//         return arr;
       
//         int j=0;
//         for(int i=0;i<m;i++){
//             if(arr1[i]>arr2[j]){
//                 int temp = arr1[i];
//                 arr1[i] = arr2[j];
//                 arr2[j] = temp;
//                 Arrays.sort(arr2);
//             }
//             else
//                 j++;
//         }
//         return arr1;
    }
}
