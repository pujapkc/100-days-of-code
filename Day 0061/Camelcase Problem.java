
import java.util.*;

class Result {

   
    public static int camelcase(String s) {
    //char ch;
    int i;
    int count=0;
    for( i=0;i<s.length();i++){
    if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
        count++;
    }
    
    }
    return count+1;

    }

}

public class Solution {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        Result obj=new Result();
        int a=obj.camelcase(s);
        System.out.println(a);
    }
}
