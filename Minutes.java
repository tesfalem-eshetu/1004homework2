/** Minutes.java - add your solutiuon to program 2 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Minutes {
    //i have used float to account for decimal entry by end user
    public static final void main(String[] args) {
        System.out.println("please provide your input in Year/s");
        Scanner input = new Scanner(System.in);
        float y = input.nextFloat();
        System.out.println("The equivalence value in minutes is=" + (y*525600));
        
        System.out.println("please provide your input in week/s");
        float w = input.nextFloat();
        System.out.println("The equivalence value in minutes is=" + (w*10080));

        System.out.println("please provide your input in day/s");
        float d = input.nextFloat();
        System.out.println("The equivalence value in minutes is=" + (d*1440));

        System.out.println("please provide your input in hour/s");
        float h = input.nextFloat();
        System.out.println("The equivalence value in minutes is=" + (h*60));
        
         
    }
    
    
}