public boolean canJump(int[] nums) {
        int furthest = nums[0];
        for (int i = 0; i <= furthest; i++){
            furthest = Math.max(furthest, i + nums[i]);

            if (furthest >= nums.length - 1)
                return true;
        }
        return false;
    }