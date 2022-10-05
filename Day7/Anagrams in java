/*Sample input-
anagram
margana

Sample output-
Anagrams
*/
/*  Test cases for this program-
- Passing first string as null string
- passing second string as null string
- passing both strings as null string
- passing two different strings (non anagrams)
- passing two anagram strings, one with upper case
- passing two anagram strings containing integers
- passing two strings composed of whitespace only
- passing two correct anagram strings
- passing two correct anagram non english strings
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         
        a = a.toLowerCase();//converting to lowercase
        b = b.toLowerCase();
        
        if(a.length() != b.length()){
            return false;
        }
        
        int[] frequency_arr =  new int[26];
        
        for(int i = 0 ; i < a.length(); i++){
            char ch = a.charAt(i);
            int index = ch - 'a';
            frequency_arr[index]++;
        }
        for(int i = 0 ; i < b.length(); i++){
            char ch = b.charAt(i);
            int index = ch - 'a';
            frequency_arr[index]--;
        }
        for(int i = 0 ; i < frequency_arr.length; i++){
            if(frequency_arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



