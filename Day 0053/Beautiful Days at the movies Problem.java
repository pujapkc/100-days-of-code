
import java.util.*;


class Result {

    

    public  int beautifulDays(int i, int j, int k) {
        
      int c,sum,rem,num,x,count=0;
    
    for(c=i; c<=j; c++)
    {
        sum = 0;
        x=c;
        while(x!=0)
        {
            rem = x%10;
            sum = sum*10+rem;
            x/=10;
        }
        num = Math.abs(c-sum);
        if(num%k==0)
        {
            count++;
        }
          
    }
     return count;
}
}

public class Solution {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        Result obj=new Result();
       int a= obj.beautifulDays(i, j, k);
       System.out.println(a);
        
    }
}
