//Task 9: String Operations

//Write a method that takes two strings, concatenates them, reverses the result, and then extracts the middle substring of the given length. Ensure your method handles edge cases, such as an empty string or a substring length larger than the concatenated string.

public class StringManipulation {
    public static String extractMiddleSubstring(String str1, String str2, int length) {
        
        String concatenated = str1.concat(str2);
        StringBuilder reversed = new StringBuilder(concatenated).reverse();
        int middleIndex = reversed.length() / 2;

        if (reversed.length() == 0 || length <= 0) {
            return ""; // Return empty string for empty or negative length
        } else if (length >= reversed.length()) {
            return reversed.toString(); 
        }

        int startIndex = middleIndex - length / 2;
        int endIndex = startIndex + length;
        return reversed.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String str1 = "Prabhas";
        String str2 = "Bahubali";
        int length = 5;

        String middleSubstring = extractMiddleSubstring(str1, str2, length);
        System.out.println("Middle Substring: " + middleSubstring); 
    }
}
