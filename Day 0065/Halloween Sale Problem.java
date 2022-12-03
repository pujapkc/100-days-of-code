import java.util.*;
public class Solution {
     static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        int nextPrice = p;
        while(s >= nextPrice) {
            count++;
            s -= nextPrice;
            nextPrice = Math.max(nextPrice-d, m);
        }
          return count;
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
