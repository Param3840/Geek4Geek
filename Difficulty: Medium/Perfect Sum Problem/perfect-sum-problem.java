class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int n= nums.length;
        int[][]dp=new int[n+1][target+1];
        dp[n][0]=1;

        for (int idx=n-1;idx>=0;idx--){
            for (int t=0;t<=target;t++){
                int leave=dp[idx+1][t];
                int take=0;
                if (nums[idx]<=t){
                    take=dp[idx+1][t-nums[idx]];
                }
                dp[idx][t]=leave+take;
            }
        }
        return dp[0][target];
    }
 
}