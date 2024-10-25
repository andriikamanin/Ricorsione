class Solution:
    def reverse_string(self, s: str) -> str:
        if not s:
            return s
        # Recursively call on the substring and add the first character after recursion
        return self.reverse_string(s[1:]) + s[0]

if __name__ == "__main__":
    s = "hello"
    print("Original:", s)
    
    sol = Solution()
    reversed_s = sol.reverse_string(s)
    
    print("Reversed:", reversed_s)

