class Solution {

    public List<Integer> generateR(int r){
        List<Integer> temp = new ArrayList<>();
        int res = 1;
        temp.add(1);
        for(int i=1; i<r; i++){
            res *= (r-i);
            res /= (i);

            temp.add(res);
        }
    return temp;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i<=numRows; i++){
           ans.add(generateR(i));
        }

        return ans;
    }
}