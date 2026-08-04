# https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        right_ptr = 0
        current_window = []
        longest_length = 0
        # sliding window implementation

        while right_ptr < len(s): 
            current_char = s[right_ptr]
            if (current_char in current_window):
                current_window = current_window[current_window.index(current_char) + 1:]  
            current_window.append(current_char)
            right_ptr += 1
            longest_length = max(longest_length, len(current_window))
        return longest_length

def lengthOfLongestSubstringUsingSet(self, s):
    current_window = set()

    left = 0
    longest = 0

    for i in range (len(s)):
        while s[i] in current_window:
             current_window.remove(s[left])
             left += 1
        current_window.add(s[i])
        longest = max(longest, (i - left + 1 ))
    return longest
