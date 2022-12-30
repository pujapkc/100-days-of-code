import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String [] args){
       Scanner in = new Scanner(System.in);
        reduceString(in.nextLine());    
    }
    static void reduceString(String s) {
        boolean found = false;
        for (int i = 0; i < s.length() - 1; i++) {
            String a = s.substring(i, i + 1);
            String b = s.substring(i + 1, i + 2);
            if (a.equals(b)) {
                s = s.substring(0, i) + s.substring(i + 2, s.length());

                reduceString(s);
                found = true;
                break;
            }
        }
        if(!found){
            if(s.isEmpty()){
                System.out.println("Empty String");
            } else {
                System.out.println(s);
            }
        }

    }

}

