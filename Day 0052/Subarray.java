import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    

    
    
       //Method Convert List to Array Integer
    public static int [] convertToArray(List<Integer> list){
        int [] arrayResult = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            arrayResult[i] = list.get(i);
        }
        return arrayResult;
    }
    
    public static int birthday(List<Integer> s, int d, int m) {
        
        //Convert to Integer Array of List s to Array s
        int [] S = convertToArray(s);
        //Init count variable
        int count = 0;
        
        //Loop through the entire array to m size
        for(int i = 0 ; i<=S.length-m; i++){
            //Initialize sum to 0
            int sum=0;
            //Each element of Array
            for(int j = i; j<i+m;j++){
               //Sum each element
               sum+=S[j]; 
            }
            //Equals numbers to d of birthDay
            if(sum==d){
                //Increment count to +1
                count++;
            }
        }
    //Return count of times to success condition sum === d (day) of Rom
        return count;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
