
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long curr = 3;
        while (t > curr) {
            t -= curr;
            curr *= 2;
        }
        System.out.println(curr-t+1);
    }
}
