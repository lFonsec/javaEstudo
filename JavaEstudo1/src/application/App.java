package application;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, y, z;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        double area1 = (a+b+c)/2;
        double area2 = (x+y+z)/2;
        System.out.println(area1);
        System.out.println(area2);
        sc.close();
    }
}
