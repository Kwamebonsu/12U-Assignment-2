/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public int binaryConvert(int n) {
        // Create a variable for the binary number
        int binary = 0;
        // If the number = 1
        if (n == 1) {
            binary = n;
            System.out.print(binary);
            return binary;
        } else {
            binary = n % 2;
            n = n / 2;
            System.out.print(binary);
            binaryConvert(n);
            return binary;
        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q5 test = new A2Q5();
        test.binaryConvert(156);
        System.out.println("");
    }
}
