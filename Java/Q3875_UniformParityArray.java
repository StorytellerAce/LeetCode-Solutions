class Solution {
    public boolean uniformArray(int[] nums1) {
       // the condition is always true because parity rules are:
       // even - even = even
       // odd - odd = even
       // even - odd = odd
       // odd - even = odd
       // because the question allows nums[i] - nums[j] for any index,
       // this means if an array has 2 parity, every number can transform to their opposite parity, so its true
       // if an array only has 1 parity, then it is already true also
       // so its true regardless of whats in the array
       return true;
    }
}