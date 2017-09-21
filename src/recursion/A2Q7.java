/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    // Create a method
    public boolean pal(String word) {

        if (word.length() > 1) {
            // Store the letters in the word as an array
            char[] array = word.toCharArray();


            // If the first letter matches the last letter, remove them from the array.
            if (array[0] == array[word.length() - 1]) {
                word = word.substring(1, word.length() - 1);
                // Call on the method again with the new word
                return pal(word);
            } else {
                // If the first letter does not match the last letter, return false
                return false;
            }

        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q7 test = new A2Q7();
        boolean lol = test.pal("racecar");
        System.out.println(lol);
    }
}
