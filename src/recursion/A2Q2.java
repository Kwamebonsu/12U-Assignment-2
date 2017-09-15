/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public int digitalSum(int numb) {
        // Create a variable for the total
        int total = 0;
        // while the number is greater than or equal to 1, the rightmost digit is added to the total and removed from the number
        if (numb >= 1) {
            total = total + (numb % 10);
            numb = numb / 10;
            // Add the digital sum to the total
            total = total + digitalSum(numb);
            return total;
        } else {
            // Once the number is less than 1 break the loop and return the total
            return total;
        }

    }

    public int digitalRoot(int numb) {
        // Create a variable for the total
        int total = digitalSum(numb);
        // If the digitalSum is 1 digit return that value
        if (numb < 10) {

            return total;
        } // If the digitalSum is more than 1 digit, run the loop again 
        else {
            return digitalRoot(total);
        }

    }

    public static void main(String[] args) {
        // Test out the method
        A2Q2 test = new A2Q2();
        int root = test.digitalRoot(2019);
        System.out.println(root);
    }
}
