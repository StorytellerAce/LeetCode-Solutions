public int[] searchRange(int[] nums, int target) {
    int first = BinarySearch(nums, target, true);
    int last = BinarySearch(nums, target, false);
    int[] ans = {first, last};
    return ans;
}

public int BinarySearch(int[] nums, int toFind, boolean findFirst){
    int left = 0;
    int right = nums.length -1;
    int candidateAns = -1;

    while (left <= right){
        int med = (left + right) / 2;
        if (nums[med] == toFind){
            candidateAns = med;

            // dont stop when found, continue to find first or last
            if (findFirst){
                // tryin to find first so continue to move to left 
                right = med - 1;
            }
            else{ //findingLast
                left = med + 1;
            }
        }
        else if (nums[med] < toFind){
            left = med + 1;
        }
        else{ // nums[med] > toFind
            right = med - 1;
        }
    }
    return candidateAns;
}