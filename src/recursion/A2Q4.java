/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public int hailstone(int n) {
        // Only accept positive numbers
        if (n > 0) {
            // If the number is even divide it by 2
            if (n % 2 == 0) {
                System.out.println(n);
                n = n / 2;
            } // If the number is odd multiply it by 3 then add 1
            else {
                System.out.println(n);
                n = 3 * n + 1;
            }
            // Once the number is 1 break the loop
            if (n == 1) {
                System.out.println(n);
                return n;
            } // If the number does not equal 1, call on the method again
            else {
                hailstone(n);
            }
            return n;
        } else {
            System.out.println("Error");
            return n;
        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q4 test = new A2Q4();
        int hail = test.hailstone(12);
    }
}
