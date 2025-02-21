package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números vc vai digitar? ");
        int n = sc.nextInt();

        if (n > 10){
            System.out.println("O valor máximo é 10!");
        }

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVOS: ");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}