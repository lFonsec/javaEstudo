package application;
import java.util.Scanner;

import entities.Triangulo;

public class programaTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();
        System.out.println(areaX);
        System.out.println(areaY);
    sc.close();
    }
}
