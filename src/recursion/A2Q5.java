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
    public void binaryConvert(int n) {
        // Create a variable for the binary number
        int binary = 0;
        // If the number = 1 end the loop
        if (n == 1) {
            binary = n;
            System.out.print(binary);
        } else if(n%2 == 1){
            // Find the remainder of the number and output it. Then divide the number by 10
           binaryConvert(n/2);
            System.out.print(1);
            
        } else{
            binaryConvert(n/2);
            System.out.print(0);
            
        }
    }

    public static void main(String[] args) {
        // Test the method
        A2Q5 test = new A2Q5();
        test.binaryConvert(156);
        System.out.println("");
    }
}
