import java.io.*;

class Result {
     public static int marsExploration(String s) {
        char[] message = new char[]{'S','O','S'};
        int start = 0;
        int end = start + 3;
        int count = 0;
        while(end <= s.length()){
            String window = s.substring(start, end);
            for(int i = 0; i < message.length;i++){
                if(message[i] != window.charAt(i)) ++count;
            }
            start = end;
            end = start + 3;
        }
        return count;
    }

    }
    
    
   public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
