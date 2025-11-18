// User function Template for Java

class Solution {
     public static int maximumPoints(int[][]arr){
        int n= arr.length;
        int[][]dp=new int[n][4];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return ninjaMemorization(arr,n-1,3,dp);
    }
    public static int ninjaMemorization(int[][]task,int day,int last,int[][]dp){
        if (day==0){

            int max=0;
            for (int i=0;i<3;i++){
                if (i!=last){
                    max=Math.max(max,task[0][i]);
                }
            }
            return max;
        }
        if (dp[day][last]!=-1) return dp[day][last];
        int max=0;
        for (int i=0;i<3;i++){
            if (i!=last){
                int points=task[day][i]+ninjaMemorization(task,day-1,i,dp);
                max=Math.max(max,points);
            }
        }
        return dp[day][last]=max;
    }
}