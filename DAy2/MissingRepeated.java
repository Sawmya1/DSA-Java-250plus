import java.util.ArrayList;

public class MissingRepeated {

    public static int[] missingAndRepeating(ArrayList<Integer> A, int n) {
           long len = n;

    long S = (len * (len+1) ) /2;
    long P = (len * (len +1) *(2*len +1) )/6;
    long missingNumber=0, repeating=0;
     
    for(int i=0;i<n; i++){
       S -= (long)A.get(i);
       P -= (long)A.get(i)*(long)A.get(i);
    }
     
    missingNumber = (S + P/S)/2;

    repeating = missingNumber - S;

    int ans[] = new int[2];
        ans[1]=(int)repeating;
        ans[0]=(int)missingNumber;


    return ans;

    }
}