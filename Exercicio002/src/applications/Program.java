package applications;

import entitites.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Digite o sálario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Digite os descontos: ");
        funcionario.descontos = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("Quantos % deseja aumentar o sálario de "+ funcionario.nome +": ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalarioBruto(porcentagem);
        System.out.println("Update data: " + funcionario);
    }
}
