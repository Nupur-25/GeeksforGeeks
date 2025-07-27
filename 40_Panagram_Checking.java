/*Given a string s, check if it is a "Panagram" or not. Return true if the string is a Panagram, else return false.

A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase.

Examples:

Input: s = "Bawds jog, flick quartz, vex nymph"
Output: true
Explanation: In the given string, there are all the letters of the English alphabet. Hence, the output is true.
Input: s = "sdfs"
Output: false
Explanation: In the given string, there aren't all the letters present in the English alphabet. Hence, the output is false.*/

// User function template for JAVA

class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
        String res=s.replaceAll(" ","");
        res=res.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<res.length(); i++){
            if(res.charAt(i)>='a' && res.charAt(i)<='z'){
                set.add(res.charAt(i));
            }
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}
