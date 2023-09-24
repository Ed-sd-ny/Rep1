import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
    
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("What's your name?");
    name = sc.nextLine();
    System.out.println("How old are you?");
    age = sc.nextInt();
    System.out.println("Hello, "+name);
    System.out.println("Wow, you are "+age);    
    }
}