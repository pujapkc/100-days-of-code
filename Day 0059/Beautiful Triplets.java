import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
    

 for(int i = 0; i < n-2; ++i) {
        for(int j = i+1; j < n-1; ++j) {
            if(a[j]-a[i] == d) {
                for(int k = i+2; k < n; ++k) {
                    if(a[k]-a[j] == d) {
                        ++sum;
                        break;
                    }
                }
                break;
            }
        }
       
    }
     System.out.println(sum);
    }
    }
