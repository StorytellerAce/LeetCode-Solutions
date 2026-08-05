# https://leetcode.com/problems/remove-duplicates-from-sorted-array/

def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
                return 0
        write_ptr = 0
        for read_ptr in range (1, len(nums)):
                if (nums[read_ptr] != nums[write_ptr]):
                        write_ptr += 1
                        nums[write_ptr] = nums[read_ptr]
        return write_ptr + 1
