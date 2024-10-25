package trovareValoreMinimoNelVettore;


class Solution {
	public int trovareValoreMinimo(int[] arr, int posizione,int valoreMinimo) {
		
		
        if(posizione >= arr.length) {
        	return valoreMinimo;
        }
        
        if(arr[posizione] < valoreMinimo) {
        	valoreMinimo = arr[posizione];
        	
        }
        
        return trovareValoreMinimo(arr, posizione + 1, valoreMinimo);
        
        
    }
	
	
}
public class Main {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 2, 8, 4};
        Solution sol = new Solution();
        int minimo = sol.trovareValoreMinimo(arr, 0, arr[0]);
        System.out.println("Valore minimo: " + minimo);
	}

}
