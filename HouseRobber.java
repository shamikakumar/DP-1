// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Did not initalize dp[1] correctly


// Your code here along with comments explaining your approach
// There are repeated subproblems so we use DP approach and store soln to these subproblems in array of length n
// dp[n] gives max amount robber can make until nth house

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);

        for(int i=2;i<nums.length;i++)
            dp[i] = Math.max(nums[i] + dp[i-2], //include ith house
                                dp[i-1]); //exclude ith house

        return dp[nums.length-1];
    }
}