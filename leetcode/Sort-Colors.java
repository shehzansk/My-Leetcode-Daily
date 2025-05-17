class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1= 0 , count2=0;
        for(int i: nums){
            if(i == 0){
                count0++;
            }
            else if(i == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        // for(int i=0; i<nums.length;i++)
        int i =0;
            while(count0!=0){
                nums[i++] = 0;
                count0--;
            }
            while(count1!=0){
                nums[i++] = 1;
                count1--;
            }
            while(count2!=0){
                nums[i++] = 2;
                count2--;
            }
    }
}