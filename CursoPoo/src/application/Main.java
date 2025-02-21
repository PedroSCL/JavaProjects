package application;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Digite as medidas do tringulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do tringulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.areaTriangulo();
        double areaY = y.areaTriangulo();

        System.out.printf("Area do tringulo X: %.4f%n", areaX);
        System.out.printf("Area do tringulo Y: %.4f%n", areaY);

        x.VerificarMaiorTriangulo(areaX, areaY);
        sc.close();
    }
}