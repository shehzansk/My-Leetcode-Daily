class Solution {
    public int differenceOfSums(int n, int m) {
        // int sumwn = 0;
        // int sumwon = 0;

        // for(int i=1;i<=n; i++){
        //    if(i%m == 0) sumwn+=i;
        //    else sumwon += i;
        // }

        // return sumwon - sumwn;

        int sum=0;
        int num = m;
        int total = n/m;
        while(total != 0){
            sum += num;
            num += m;
            total--;
        }
        int sn = (n*(n+1))/2;
        return sn-(2*sum);
    }
}