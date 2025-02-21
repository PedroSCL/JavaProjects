package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);

        double v = Calculator.volume(raio); 

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", calc.PI);

        sc.close();
    }
}
