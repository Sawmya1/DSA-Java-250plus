import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Search2DMatrix {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int lo = 0, hi = (m*n)-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(mat.get(mid/n).get(mid%n) == target)
                return true;
            if(mat.get(mid/n).get(mid%n) < target)
                lo = mid+1;
            else
                hi = mid-1;
        }
        return false;        

	}
}
