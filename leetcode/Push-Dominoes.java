class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length(),i,j=Integer.MIN_VALUE;
        char dom[]=dominoes.toCharArray(), res[]=new char[n];
        boolean r = false,l=true;
        for(i=0;i<n;i++){
            res[i]=dom[i];
            if(dom[i]=='L'){
                if(l){ 
                    fill(j,i,res,0,-1);
                    if(j>=0) res[j]='L';
                }
                else fill(j,i,res,1,-1);
                l=true;
                j=i;
            }else if(dom[i]=='R' || i==n-1){
                if(!l){
                    fill(j,i,res,1,0);
                    res[i]='R';
                }
                j=i;
                l=false;
            }
        }
        return new String(res);
    }
    void fill(int j, int i, char[] res, int incrj, int incri){
        for(;j<i && i>=0;j+=incrj,i+=incri){
            if(j>=0) res[j]='R';
            res[i]='L';
        }
    }
}