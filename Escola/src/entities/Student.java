package entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaFinal;

    public double notaFinal() {
        if(this.nota1 > 0 && this.nota2 > 0 && this.nota3 > 0) {
            return this.notaFinal = this.nota1 + this.nota2 + this.nota3;
        } else {
            System.out.println("Nota inválida");
            return 0;
        }
    }

    public void verificarNota() {
        if (this.notaFinal >= 60 && this.notaFinal <= 100) {
            System.out.println("Aprovado");
        } else if (this.notaFinal >= 0) {
            System.out.println("Reprovado");
            System.out.println("Faltam : " + String.format("%.2f", 60 - this.notaFinal) + " pontos");
        } else {
            System.out.println("Média inválida");
        }
    }

}
