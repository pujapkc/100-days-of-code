import java.util.*;


    class result{
      public  int countingValleys(int steps, String path) {
        int valleys = 0;
        int level = 0;
        
        for(int i = 0; i < steps; i++){
            if(path.charAt(i) == 'U'){
                if(level == -1){
                    valleys++;
                }
                level++;
            }else{
                level--;
            }
        }
        return valleys;
    }
    }



public class Solution {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        result ob=new result();
           int steps;
           String path;
           steps=sc.nextInt();
           path=sc.next();
           
  int a= ob.countingValleys(steps,path);
  System.out.println(a);
}
}
