//1823. Find the Winner of the Circular Game
import java.util.*;
public class FindWinnerCircularGame {
    public static int findTheWinner(int n, int k) {
        // int res = 0;
        // for(int i=1; i<=n; ++i){
        //     res = (res + k) % i;
        // }
        // return res + 1;

        Queue<Integer> q1 = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q1.add(i);
        }

        while(q1.size() > 1){
            for(int i=1; i<k; i++){
                q1.add(q1.poll());
            }
            q1.poll();
        }
        return q1.peek();
    }
}
