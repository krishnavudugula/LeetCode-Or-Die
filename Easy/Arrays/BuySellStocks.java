//121. Best Time to Buy and Sell Stocks.
import java.util.*;
public class BuySellStocks {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }

        System.out.println(maxProfit(prices));
    }
}
