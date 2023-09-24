import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency =sc.nextDouble();
        System.out.println("Enter amount");
        int hryvna = sc.nextInt();
        int amount = convert(hryvna,currency);
        double rest = getChange(hryvna,currency);
        print(amount,rest);
        }   
        static int convert(double currency, int hryvna) {
        return((int)(hryvna/currency));    
        } 
        static double getChange(double currency, int hryvna) {
        return hryvna/currency - convert(currency,hryvna);
        }
        static void print(int amount, double rest) {
            System.out.println("You can buy " + amount);
            if (rest != 0) {
            System.out.printf("You rest is %.2f", rest);
            System.out.println(); 
            }  
        }
    
}