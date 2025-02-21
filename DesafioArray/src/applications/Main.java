package applications;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Aluguel " + (i+1) + ":");
            System.out.print("Digite o Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite o email: ");
            String email = sc.nextLine();
            System.out.print("Digite o quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Rent(nome, email);

        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].toString());
            }
        }
        sc.close();
    }
}