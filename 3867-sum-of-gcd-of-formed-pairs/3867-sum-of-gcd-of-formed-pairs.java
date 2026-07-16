class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            nums[i] = gcd(nums[i], mx);   // overwrite in place
        }
        
        java.util.Arrays.sort(nums);
        
        long sum = 0;
        for (int l = 0, r = n - 1; l < r; l++, r--) {
            sum += gcd(nums[l], nums[r]);
        }
        return sum;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}