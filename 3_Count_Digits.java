class Solution{
public:
    int evenlyDivides(int N){
        int x=N;
        int count=0;
        while(x>0){
            int rem=x%10;
            if(rem!=0 && N%rem==0){
                count++;
            }
            x=(x-rem)/10;
        }
        return count;
    }
};
