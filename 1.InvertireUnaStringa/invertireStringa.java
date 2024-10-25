package invertireUnaStringa;

class Solution {
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        
        // Рекурсивно вызываем на подстроке и добавляем первый символ после завершения рекурсии
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original: " + str);

        Solution sol = new Solution();
        String reversed = sol.reverseString(str);
        
        System.out.println("Reversed: " + reversed);
    }
}

