import java.util.Scanner;

public class Addtwonum {
    public static void main(String[] args) {
        System.out.print("Enter any two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("sum of two number:"+c);
    }
}
