import java.util.*;
public class diagonal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n;
        n=sc.nextInt();
        int mat[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int principaldiagonal=0;
         for(int i=0;i<n;i++){
            principaldiagonal+=mat[i][i];
                
         }
         int secondarydiagonal=0;
         for(int i=0;i<n;i++){
             secondarydiagonal+=mat[i][n-i-1];
         }
         int diff=principaldiagonal-secondarydiagonal;
         diff=Math.abs(diff);
         System.out.println(diff);
    }
}
