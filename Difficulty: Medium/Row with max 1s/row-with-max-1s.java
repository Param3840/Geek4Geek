// User function Template for Java

class Solution {
     public static int lowerBound(int[]arr,int x){
        int n= arr.length;
        int low=0,high=n;
        while (low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid;
            }
        }
        return low;
    }
    public int rowWithMax1s(int arr[][]) {
        // code here
        int m= arr[0].length;
        int max=0;
        int rowIndex=-1;
        for (int i=0;i< arr.length;i++){
            int countOnes=m-lowerBound(arr[i],1);
            if (countOnes>max){
                max=countOnes;
                rowIndex=i;
            }
        }
        return rowIndex;
    }
}