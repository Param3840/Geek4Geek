class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        boolean[][]dp=new boolean[n+1][sum+1];
        for (int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for (int idx=1;idx<=n;idx++){
            for (int target=1;target<=sum;target++){
                boolean skip=dp[idx-1][target];
                boolean take = false;
                if (arr[idx-1]<=target){
                    take=dp[idx-1][target-arr[idx-1]];
                }
                dp[idx][target]=skip||take;
            }
        }
        return dp[n][sum];
    }
}