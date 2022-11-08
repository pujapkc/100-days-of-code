import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int m=A.length();
        int n=B.length();
        int len=m+n;
        System.out.println(len);
        int comp=A.compareTo(B);
        if(comp>0)
        {
            System.out.println("Yes");
            
        }
        else
        {
            System.out.println("No");
        }
        //for first word
        String Firstletter1=A.substring(0,1);
        String remletter1=A.substring(1,A.length());
        Firstletter1=Firstletter1.toUpperCase();
        String capitalize1=Firstletter1+remletter1;
        //for second word
        String Firstletter2=B.substring(0,1);
        String remletter2=B.substring(1,B.length());
        Firstletter2=Firstletter2.toUpperCase();
        String capitalize2=Firstletter2+remletter2;
        
        System.out.println(capitalize1+" "+capitalize2);
        
    }
}



