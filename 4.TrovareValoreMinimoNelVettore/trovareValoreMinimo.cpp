#include <iostream>

class Solution {
public:
    int trovareValoreMinimo(int arr[], int posizione, int valoreMinimo, int length) {
        if (posizione >= length) {
            return valoreMinimo;
        }
        
        if (arr[posizione] < valoreMinimo) {
            valoreMinimo = arr[posizione];
        }
        
        return trovareValoreMinimo(arr, posizione + 1, valoreMinimo, length);
    }
};

int main() {
    int arr[] = {3, 5, 2, 8, 4};
    int length = sizeof(arr) / sizeof(arr[0]);
    Solution sol;
    int minimo = sol.trovareValoreMinimo(arr, 0, arr[0], length);
    
    std::cout << "Valore minimo: " << minimo << std::endl;

    return 0;
}
