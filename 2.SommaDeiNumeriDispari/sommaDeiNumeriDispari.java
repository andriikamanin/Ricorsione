package sommaDeiNumeriDispari;

class Solution {
	public int sommaDiNumeriDispari(int n) {
        if (n <= 0) {
            return 0;
        }
       
        return (n % 2 != 0 ? n : n - 1) + sommaDiNumeriDispari(n - 2);
    }
	
	 /* OR
	  * 
	  * public int sommaDiNumeriDispari(int n) {
	    	if(n >= 0) {
	    		if(n%2!=0) {
	            	return n + sommaDiNumeriDispari(n - 2);
	            }
	            return sommaDiNumeriDispari(n - 1);
	    	}else {
	    		return 0;
	    	}
	        
	  }*/
}
public class Main {

	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int somma = sol.sommaDiNumeriDispari(6);
		System.out.println(somma);
	}

}
