#include <iostream>
#include <vector>

class Solution {
public:
    int sommaDelVettore(const std::vector<int>& arr, int posizione) {
        if (posizione >= arr.size()) {
            return 0;
        }
        
        return arr[posizione] + sommaDelVettore(arr, posizione + 1);
    }
};

int main() {
    std::vector<int> arr = {3, 5, 2};
    Solution sol;
    int somma = sol.sommaDelVettore(arr, 0);
    
    std::cout << "Array length: " << arr.size() << std::endl;
    std::cout << "Somma: " << somma << std::endl;

    return 0;
}
