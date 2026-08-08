# https://leetcode.com/problems/remove-element/

def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        if not nums:
                return 0
        write_ptr = 0
        for read_ptr in range (len(nums)):
                if (nums[read_ptr] != val):
                        nums[write_ptr] = nums[read_ptr]
                        write_ptr += 1
        return write_ptr 
