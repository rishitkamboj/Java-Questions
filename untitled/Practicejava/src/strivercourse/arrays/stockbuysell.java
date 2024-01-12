package strivercourse.arrays;

public class stockbuysell {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};
       buysell(arr);
    }

    /* BEST TIME TO BUy & SELL STOCK
    int arr[]={7,1,5,3,6,4} these are the days (n no. of days)
    decide a day when u buy the stock
    suppose buy=1
    suppose sell=6      profit=5
    basically the question is to maximize the profit
     */

    static void buysell(int arr[]){

        int min=arr[0],profit=0;
        for (int i=1;i<arr.length;i++){
           int cost=arr[i]-min;
           profit=Math.max(profit,cost);
           min=Math.min(min,arr[i]);
            }

        System.out.println("Max profit "+profit);

    }
}
