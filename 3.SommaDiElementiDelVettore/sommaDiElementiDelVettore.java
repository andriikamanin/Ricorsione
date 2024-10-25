package sommaDiElementiDelVettore;


class Solution {
	public int sommaDelVettore(int[] arr, int posizione) {
        if(posizione >= arr.length) {
        	return 0;
        }
        
        return  arr[posizione] + sommaDelVettore(arr, posizione + 1);
    }
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,2};
		Solution sol = new Solution();
		int somma = sol.sommaDelVettore(arr, 0);
		System.out.println(arr.length);
		System.out.println("Somma: " + somma);
	}

	

}
