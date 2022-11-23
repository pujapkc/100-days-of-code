import java.util.*;

class Result {

   


    public static int findDigits(int dividend) {
        int divisorCandidate = 0;
        int remainingDividend = dividend; // store the temporary state of the dividend for each operation
        int numberOfDivisors = 0;
        
        while (remainingDividend > 0) {
            divisorCandidate = remainingDividend % 10; // get the rightmost digit
            remainingDividend /= 10; // extract the rightmost digit
            if (divisorCandidate != 0 && dividend % divisorCandidate == 0) { // condition for being divisor
                numberOfDivisors++;        
            }
        }
        
        return numberOfDivisors;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        
        for (int testCase = 0; testCase < numberOfTestCases; testCase++) {
            int inputNumber = scanner.nextInt();
            int numberOfDivisors = Result.findDigits(inputNumber);
            System.out.println(numberOfDivisors);
        }
        
        scanner.close();
    }
}
