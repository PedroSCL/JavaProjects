import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double kelvin = temperaturaCelsius + 273.15;
        double farenheit = temperaturaCelsius * 1.8 + 32;

        System.out.println("A temperatura em Kelvin é: " + kelvin);
        System.out.println("A temperatura em farenheit é: " + farenheit);
    }
}
