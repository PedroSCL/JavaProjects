package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Register of product
        System.out.print("Cadastro de Produto\n");
        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        double price = sc.nextDouble();
        System.out.print("Digite o quantidade do produto: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Nome atualizado: " + product.getName());
        System.out.println("Product Data: " + product + "\n");

        //Add product
        System.out.print("Digite a quantidade que deseja adicionar: ");
        product.addProduct(sc.nextInt());
        System.out.println("Product Data: " + product + "\n");

        //Remove product
        System.out.print("Digite a quantidade que deseja remover: ");
        product.removeProduct(sc.nextInt());
        System.out.println("Product Data: " + product + "\n");

        sc.close();
    }
}
