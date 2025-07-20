/*Given a string s, reverse the string without reversing its individual words. Words are separated by dots(.).

Note: The string may contain leading or trailing dots(.) or multiple dots(.) between two words. The returned string should only have a single dot(.) separating the words, and no extra dots should be included.*/

class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder str = new StringBuilder();
        String[] arr= s.split("\\.+");
        for(int i=arr.length-1; i>=0; i--){
            str.append(arr[i]);
            if(i>0){
                str.append(".");
            }
        }
        int i=0;
        while(str.charAt(i)=='.'){
            str.deleteCharAt(i);
            i++;
        }
        i=str.length()-1;
        while(str.charAt(i)=='.'){
            str.deleteCharAt(i);
            i--;
        }
        return str.toString();
    }
}
