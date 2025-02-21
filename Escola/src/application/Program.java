package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        student.nota3 = sc.nextDouble();

        System.out.println("\nNota final do aluno: " + String.format("%.2f", student.notaFinal()));
        System.out.print("Situação: ");
        student.verificarNota();
        sc.close();
    }
}
