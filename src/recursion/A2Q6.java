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
    public String convert(int n, int b) {
        // If the number = 0 end the loop
        if (n == 0) {
            return "" + 0;
        }
        int remainder = n % b;
        String rem = toLetter(remainder);
        int number = n / b;
        return convert(number, b) + rem;

    }

    public String toLetter(int num) {
        String letter = "";
        switch (num) {
            case 10:
                letter = "A";
                break;
            case 11:
                letter = "B";
                break;
            case 12:
                letter = "C";
                break;
            case 13:
                letter = "D";
                break;
            case 14:
                letter = "E";
                break;
            case 15:
                letter = "F";
                break;
            default:
                letter = "" + num;
                break;
        }
        return letter;
    }

    public static void main(String[] args) {
        // Test the method
        A2Q6 test = new A2Q6();
        System.out.println(test.convert(1000, 16));
    }
}
