// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        if(isPalin(sum)){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isPalin(int num){
        int b = num;
        int a = 0;
        while(num!=0){
            int rem = num%10;
            a = a*10+rem;
            num = num/10;
        }
        if(b == a){
            return true;
        }
        else{
            return false;
        }
    }
}
