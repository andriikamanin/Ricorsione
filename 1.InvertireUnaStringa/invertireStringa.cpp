#include <iostream>
#include <string>

class Solution {
public:
    std::string reverseString(const std::string& str) {
        if (str.empty()) {
            return str;
        }
        
        
        return reverseString(str.substr(1)) + str[0];
    }
};

int main() {
    std::string str = "hello";
    std::cout << "Original: " << str << std::endl;

    Solution sol;
    std::string reversed = sol.reverseString(str);
    
    std::cout << "Reversed: " << reversed << std::endl;

    return 0;
}
