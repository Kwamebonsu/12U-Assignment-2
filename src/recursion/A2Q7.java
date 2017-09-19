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
        // Compare the first and last letter of the word
        if (word.charAt(word.length() - 1) == word.charAt(0)) {
        }
        return true;
    }

    public static void main(String[] args) {
        // Test the method
        A2Q7 test = new A2Q7();
        test.pal("Racecar");
    }
}
