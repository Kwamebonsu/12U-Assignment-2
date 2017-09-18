/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    // Create a new Method
    public int pyramid(int n) {
        // Set the return values if n = 1 or 2
        if (n == 1) {
            return n;
        } else if (n == 2) {
            return n + (n - 1);
        } // add the number to the previous number
        else {
            return n + pyramid(n - 1);
        }

    }

    public static void main(String[] args) {
        // Test the method
        A2Q3 test = new A2Q3();
        int total = test.pyramid(6);
        System.out.println(total);
    }
}
