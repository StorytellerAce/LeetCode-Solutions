# https://leetcode.com/problems/3sum/

def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        triplets = []
        nums.sort()
        for i in range (len(nums)):
            if (i > 0 and nums[i] == nums[i-1]):
                 continue
            left_ptr = i + 1
            right_ptr = len(nums) - 1

            while (left_ptr < right_ptr):
                total = nums[left_ptr] + nums[right_ptr] + nums[i]
                if (total == 0):
                     triplets.append([
                          nums[i],
                          nums[left_ptr],
                          nums[right_ptr]
                     ])
                     left_ptr += 1
                     right_ptr -= 1
                     while(left_ptr < right_ptr and nums[left_ptr] == nums[left_ptr - 1]):
                        left_ptr += 1
                     while(left_ptr < right_ptr and nums[right_ptr] == nums[right_ptr + 1]):
                        right_ptr -= 1

                elif total < 0:
                     left_ptr += 1

                else:
                     right_ptr -= 1

        return triplets
