/** Change.java - add your solutiuon to program 3 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        //since we need a due payment for the algortihm to work i have assumed it to be 4000 , represented by y
        int y;
        y= 4000;
        System.out.println("Dear customer thank you for choosing our service. This is your virtual cashier Tesfalem, your payment due amount is =" + y +"cent/s please make your payment below:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
            while (x<y){
            System.out.println( "Dear customer your payment is below the due amount , therefore it has been declined and refunded. please make your payment again");
            break;
            }

            if(x==y){
                System.out.println("Dear customer thank you for choosing us ,your payment has been processed and you have no changes remaining. Thank you :)");
            }
            if (x>y){
                int z= x-y;
                int c = z / 100;
                int d = z % 100;
                int e = d / 25;
                int f = d % 25;
                int g = f / 10;
                int h = f % 10;
                int i = h / 5;
                int j = h % 5;
                int k = j / 1;
        
                System.out.println("Dear customer thank you for choosing us, your payment is processed and your changes are_" + c + "_dollars_" + e + "_quarters_" + g + "_dimes_" + i + "_nickels & _" + k + "_pennies_" + "Thank you:)");

            }     
    }
    
    
}