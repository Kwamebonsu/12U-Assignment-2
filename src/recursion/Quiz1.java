/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class Quiz1 {

    public void swap(char[] array, int p1, int p2) {
        char temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    // Create a new method
    public String reverseString(String word) {
        // Create a variable for the reversed word
        String reverse = "";
        // Stop calling on the method once the 2 words are the same length
        if (reverse.length() != word.length()) {
            // Add the last letter of the word to reverse
            reverse = reverse + word.substring(word.length() - 1, word.length());
            // Remove the last letter from the word
            word = word.substring(0, word.length() - 1);
            // Call on the method again and add it to reverse
            reverse = reverse + reverseString(word);
            return reverse;
        } else {
            return reverse;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test the Method
        Quiz1 test = new Quiz1();
        String lol = test.reverseString("frog");
        System.out.println(lol);
    }
}
