#include <iostream>

class Solution {
public:
    int sommaDiNumeriDispari(int n) {
        if (n <= 0) {
            return 0;
        }

        // If n is odd, add it; if even, use n-1, then recurse with n-2
        return (n % 2 != 0 ? n : n - 1) + sommaDiNumeriDispari(n - 2);
    }

   
};

int main() {
    Solution sol;
    int somma = sol.sommaDiNumeriDispari(6);
    std::cout << somma << std::endl;

    return 0;
}
