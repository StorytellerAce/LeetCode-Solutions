def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        return self.countHelper("1", n-1)
        
def countHelper(self, s, n):
        if (n == 0):
            return s
        s2 = ""
        i = 0
        while (i < len(s)):
            repeatingChar = 1
            currentChar = s[i]
            while (i + 1 < len(s) and s[i + 1] == currentChar):
                repeatingChar += 1
                i += 1
            s2 += f"{repeatingChar}{currentChar}"
            i += 1
        return self.countHelper(s2, n-1)
