// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        if (n==0) return 0;
        if (n==1) return arr[0];
        int prev2=arr[0];
        int prev=Math.max(arr[0],arr[1]);
        for (int i=2;i<n;i++){
            int take=arr[i]+prev2;
            int nonTake=prev;
            int curr=Math.max(take,nonTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}