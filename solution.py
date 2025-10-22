class Solution:
    def maxPower(self, s):
        m = 0
        c = 1
        for i in range(len(s) - 1):
            if s[i] == s[i + 1]:
                c += 1
            else:
                if c >= m:
                    m = c
                c = 1
        
        return max(m, c)
