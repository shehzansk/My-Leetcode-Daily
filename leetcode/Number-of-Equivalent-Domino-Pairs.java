class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        int n = dom.length;
        int count =0;
        

        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n;j++ ){
        //         if((dom[i][0] == dom[j][0] && dom[i][1] == dom[j][1]) || 
        //         (dom[i][1] == dom[j][0] && dom[i][0] == dom[j][1])){
        //             count++;
        //         }
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < dom.length; i++) {
            int a = dom[i][0];
            int b = dom[i][1];
            int key = a < b ? a * 10 + b : b * 10 + a;

            count += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;


    }
}