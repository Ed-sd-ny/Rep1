import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter number");
        //int usernumb = scan.nextInt();
        //if(usernumb > 5) {
        //    System.out.println("The number is more than 5");   
        //}
           // System.out.println("The number is less than 5"); 
        System.out.println("Are you happy?");
        boolean isHappy = scan.nextBoolean();   
        //boolean isHappy = true;
        if(isHappy) System.out.println("I'm happy");  
        else System.out.println("I'm  not happy");
    }
}    