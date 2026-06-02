class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxAvg = -100000;

        for(int i = 0; i <= nums.length - k; i++) {

            int sum = 0;

            for(int j = i; j < i + k; j++) {
                sum += nums[j];
            }

            double avg = (double) sum / k;

            if(avg > maxAvg) {
                maxAvg = avg;
            }
        }

        return maxAvg;
    }
}