/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    public int convert(int n, int b) {
        // Create a variable for the binary number
        int remainder = 0;
        // If the number = 1 end the loop
        if (n == 1) {
            remainder = n;
            System.out.print(remainder);
            return remainder;
        } else {
            // Find the remainder of the number and output it. 
            remainder = n % b;
            // Divide the number by b
            n = n / b;
            System.out.print(remainder);
            // Call on the method again
            convert(n, b);
            return remainder;
        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q6 test = new A2Q6();
        test.convert(1000, 8);
        System.out.println("");
    }
}
