import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        int r;
        System.out.println("Enter the value of radius");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        double p=3.142;
        double A = (Math.PI)*r*r;
        System.out.println("Area of a circle:"+A);
    }
}
