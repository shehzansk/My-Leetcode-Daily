class Solution {
    public int jump(int[] nums) {
       if(nums.length<=2)return nums.length-1;
       int max=nums[0];
       int count=1;
       int end=nums[0];
       for(int i=0; i<nums.length-1;i++){
        max=Math.max(max, nums[i]+i);
        if(i==end){
            end=max;
            count++;
        }
       } 
       return count;
    }
}