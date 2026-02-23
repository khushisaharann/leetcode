class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        // double maxAverage = Double.NEGATIVE_INFINITY;
        // for(int i = 0; i <= n-k; i++){
        //     int sum = 0;
        //     //recompute the sum on each window - not optimize
        //     for(int j = i; j <i+k; j++){
        //         sum = sum + nums[j];
        //     }
        //     maxAverage = Math.max(maxAverage, (double)sum / k);
        // }
        // return maxAverage;

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        long maxSum = sum;
        for(int right = k; right < n; right++){
            int left = right-k;
            sum = sum - nums[left] + nums[right];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}