
import java.util.*;

class Result {

    

    public  void equalizeArray(int arr[],int n) {
        Arrays.sort(arr);
         int ans = 1,repeat = 1;
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
            repeat++;
            if(ans < repeat)
            ans = repeat;
        }
        else 
            repeat = 1;
        }
       System.out.println(n-ans);
    }

}

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Result obj=new Result();
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.equalizeArray(arr,n);
    }
}
