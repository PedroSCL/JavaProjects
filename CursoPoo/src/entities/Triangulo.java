package entities;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double areaTriangulo() {
        double p = (a + b + c) / 2;
        return Math.sqrt( p * (p - a) * (p - b) * (p - c));

    }

    public void VerificarMaiorTriangulo(double areaX, double areaY) {
        if (areaX > areaY) {
            System.out.println("Triangulo X é maior");
        } else {
            System.out.println("Triangulo Y é maior");
        }
    }
}
