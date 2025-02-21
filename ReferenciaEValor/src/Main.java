import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect1 = new double[n];

        for(int i = 0; i < n; i++){
            vect1[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < n; i++){
            soma += vect1[i];
        }

        double media = soma / n;
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}