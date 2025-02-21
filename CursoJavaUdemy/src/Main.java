import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original = " ABCD abcd askdask ASJDJASDJ ";
        String versao01 = original.toUpperCase();
        String versao02 = original.trim();
        String versao03 = versao02.substring(2, 7);

        System.out.println("-" + original + "-");
        System.out.println("-" + versao01 + "-");
        System.out.println("-" + versao02 + "-");
        System.out.println("-" + versao03 + "-");
    }
}