class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long streak = 0;  // track continuous zeros

        for (int num : nums) {
            if (num == 0) {
                streak++;
                count += streak;  // each new zero extends all previous subarrays
            } else {
                streak = 0;
            }
        }
        return count;
    }
}