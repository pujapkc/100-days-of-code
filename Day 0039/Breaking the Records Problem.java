import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static List<Integer> breakingRecords(List<Integer> scores) {
      int maxScore=0;
int minScore=0;
int maxCount=0;
int minCount=0;
int i=0;
List<Integer> scoring= new ArrayList<>();    
for(Integer item: scores){

    if(i==0){
        i++;
        maxScore=item;
        minScore=item;                    
    }

    else{
        if(item>maxScore){
            maxScore=item;
            maxCount++;
        }
        if(item<minScore){
            minScore=item;
            minCount++;
        }

    }
}

scoring.add(maxCount);
scoring.add(minCount);

return scoring;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
