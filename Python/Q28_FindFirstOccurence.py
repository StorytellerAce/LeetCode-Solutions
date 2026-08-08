# https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
# KMP solution
def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if not needle:
               return 0
        if not haystack:
               return -1

        matched = 0
        LPSTable = self.LPSTableConstruction(needle)

        for i in range(len(haystack)):
                while (matched > 0 and haystack[i] != needle[matched]):
                        matched = LPSTable[matched-1]
                if (haystack[i] == needle[matched]):
                        matched += 1
                        if (matched == len(needle)):
                                return i - matched + 1
                else:
                    matched = LPSTable[matched-1] if matched > 0 else 0
        return -1

def LPSTableConstruction(self, needle):
       LPSTable = [0] * len(needle)
       length = 0
       i = 1

       while i < len(needle): 
              if (needle[i] == needle[length]):
                     length += 1
                     LPSTable[i] = length
                     i += 1
              elif (length > 0):
                     length = LPSTable[length-1]
              else:
                     LPSTable[i] = 0
                     i += 1

       return LPSTable
                     
              