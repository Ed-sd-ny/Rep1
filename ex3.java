import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency =sc.nextDouble();
        System.out.println("Enter amount");
        int hryvna = sc.nextInt();
        int amount = ((int)(hryvna/currency));
        double rest = hryvna/currency - amount;
        System.out.println("You can buy " + amount);
        System.out.printf("You rest is %.2f", rest);
        System.out.println();

    }   
}
