/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bonsk5852
 */
public class A2Q1 {

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

        //        int total = 0;
//        if(numb >= 1){
//            total = total + numb % 10;
//            System.out.println(total);
//            numb = numb / 10;
//            return numb;
//        } else {
//            return digitalSum(numb);
//        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q1 test = new A2Q1();
        int sum = test.digitalSum(126);
        System.out.println(sum);
    }
}
