package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Digite a largura e a altura do retangulo: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println("Area do retangulo: " + rectangle.area());
        System.out.println("Perimetro do retangulo: " + rectangle.perimeter());
        System.out.println("Diagonal do retangulo: " + rectangle.diagonal());

        sc.close();
    }
}
