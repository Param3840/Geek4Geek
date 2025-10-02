class Solution {
    int countWays(int n) {
        // your code here
        if (n==0 || n==1) return 1;
        int currStep=0;
        int prepStep=1;
        int prepPrevStep=1;

        for (int i=2;i<=n;i++){
            currStep=prepStep+prepPrevStep;
            prepPrevStep=prepStep;
            prepStep=currStep;
        }
        return currStep;
    }
}
