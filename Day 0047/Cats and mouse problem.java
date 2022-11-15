
import java.util.*;


public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
            int catA = (x >= z) ? x - z : z - x;
        int catB = (y >= z) ? y - z : z - y;
        
        return (catA > catB) ? "Cat B" : (catA < catB) ? "Cat A" : "Mouse C";

    }

 
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

            int q=sc.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            
            int x = sc.nextInt();

            int y = sc.nextInt();

            int z = sc.nextInt();

            String result = catAndMouse(x, y, z);
           System.out.println(result);
           
        }

       

        sc.close();
    }
}
