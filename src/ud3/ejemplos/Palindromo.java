package ud3.ejemplos;

public class Palindromo {
    public static void main(String[] args) {
        String palindromo = "Dabale arroz a la zorra el abad";
        int len = palindromo.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // volcamos la cadena en un array de caracteres

        for (int i = 0; i < len; i++) {
            tempCharArray[i]=palindromo.charAt(i);
        } 
        
        // le damos la vuelta
        for (int j = 0; j < len; j++) {
            charArray[j]=tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}