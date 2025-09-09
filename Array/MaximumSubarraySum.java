import java.util.*;
class MaximumSubarraySum{

    static int MaximumSubarraySum(int[] arr){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(arr[i],maxEnding+arr[i]);
            res=Math.max(res,maxEnding);
        }


        return res;
    }

    public static void main(String [] args){
        int[] arr={2,3,-8,7,-1,2,3};
        int maxsum=MaximumSubarraySum(arr);
        System.out.println(maxsum);
    }
}