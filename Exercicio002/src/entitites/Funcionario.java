package entitites;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double descontos;

    public double salarioLiquido(){
        return salarioBruto - descontos;
    }

    public void aumentarSalarioBruto(double porcentagem){
        salarioBruto += salarioBruto * (porcentagem / 100.0);
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
