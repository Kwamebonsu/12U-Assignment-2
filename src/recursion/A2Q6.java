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
            if (remainder < 10) {
                System.out.print(remainder);
            } else if (remainder == 10) {
                System.out.println("A");
            } else if (remainder == 11) {
                System.out.println("B");
            } else if (remainder == 12) {
                System.out.println("C");
            } else if (remainder == 13) {
                System.out.println("D");
            } else if (remainder == 14) {
                System.out.println("E");
            } else if (remainder == 15) {
                System.out.println("F");
            }
            // Call on the method again
            convert(n, b);
            return remainder;
        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q6 test = new A2Q6();
        test.convert(1000, 16);
        System.out.println("");
    }
}
