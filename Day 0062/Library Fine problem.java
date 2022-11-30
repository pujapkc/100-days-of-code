
import java.util.*;


class Result {

    

    public  void libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    int fine=0;
    if(y1>y2){
        fine=10000;
    }
    else if(y1==y2 && m1>m2){
        fine=500*(m1-m2);
    }
    else if(y1==y2 && m1==m2 && d1>d2){
        fine=15*(d1-d2);
    }
     System.out.println(fine);
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Result obj=new Result();
        
        int d1,d2,m1,m2,y1,y2;
        d1=sc.nextInt();
        m1=sc.nextInt();
        y1=sc.nextInt();
        d2=sc.nextInt();
        m2=sc.nextInt();
        y2=sc.nextInt();
        
        obj.libraryFine(d1, m1, y1, d2, m2, y2);
        //System.out.println(f);
        
        
    }
}
