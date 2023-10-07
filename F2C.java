/** F2C.java - add your solutiuon to program 1 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class F2C {
    public static final void main(String[] args) {
        
        /* I have used floats to avoid "InputMismatchException" 
        error incase the end user inputs decimals , int operation could 
        work fine as far as the end user does input decimals and the like*/

        System.out.println("Welcome, I will be helping you convert fahrenheit to celsius. Please provide your input fahrenheit below. Thank you for using my platform :)");
        Scanner input = new Scanner(System.in);
        float Tf = input.nextFloat();
        /* I have used 0.5555556 instead of defining a as 5 and b as 9  and use the quotient as an input
        since it a constant and is always there*/
        System.out.println("The equivalence in degree celsius is ="  + (0.5555556*(Tf-32)));
    }
         
    
}