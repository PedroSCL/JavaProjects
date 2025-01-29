package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta1;

        System.out.print("Digite o nome do Titular da conta: ");
        String titular = sc.nextLine();
        System.out.print("Digite o numero da Conta: ");
        int conta = sc.nextInt();
        sc.nextLine();


        System.out.print("Deseja fazer um depósito inicial? (S/N): ");
        String opcao = sc.nextLine();
        opcao = opcao.toUpperCase();

        if (opcao.equals("S")) {
            System.out.println("\n\nDEPÓSITO INICIADO\n\n");
            System.out.print("Digite o valor de depósito: ");
            double depositoInicial = sc.nextDouble();
            conta1 = new Conta(conta, titular, depositoInicial);
            conta1.depositar(depositoInicial);
        } else {
            System.out.println("Depósito inicial pulado! ");
            conta1 = new Conta(conta, titular);
        }

        System.out.println(conta1.toString());

        System.out.print("Digite o valor que deseja depositar: ");
        double valorDeposito = sc.nextDouble();
        conta1.depositar(valorDeposito);
        System.out.println(conta1);

        System.out.print("Digite o valor que deseja sacar: ");
        double valorSacar = sc.nextDouble();
        conta1.sacar(valorSacar);
        System.out.println(conta1);

        sc.close();
    }
}
