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
        int triangle[] = new int[n];
        triangle[0] = 1;
        triangle[1] = 2;
        if (n > 1) {
            triangle[n] = triangle[n - 1] + triangle[n - 2];
            pyramid(n);
        } else {
            return (triangle[n]);
        }
        return (triangle[n]);
    }

    public static void main(String[] args) {
        // Test the method
        A2Q3 test = new A2Q3();
        int total = test.pyramid(6);
        System.out.println(total);
    }
}
