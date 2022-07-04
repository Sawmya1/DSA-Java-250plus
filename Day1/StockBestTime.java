import java.util.* ;

public class StockBestTime{
    public static int maximumProfit(ArrayList<Integer> prices){
        int maxPro=0, minp=Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            minp = Math.min(minp, prices.get(i));
            maxPro = Math.max(maxPro, prices.get(i)-minp);
        }
        return maxPro;
    }
  public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
    System.out.println(maxProfit(arr));

  }

}