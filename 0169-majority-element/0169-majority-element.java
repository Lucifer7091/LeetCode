class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        int count=0;
        for(int num : nums)
        {
            if(0==count)
            {
                max=num;
            }
            count += (num==max) ? 1:-1;
        }
        return max;
        
    }
}