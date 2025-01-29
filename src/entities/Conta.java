package entities;

public class Conta {
    private int numeroConta;
    private String titularConta;
    private double saldo;

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Conta(int numeroConta, String titularConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        depositoInicial = depositoInicial;
    }

    public Conta(int numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor insuficiente");
        }
    }


    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor + 5;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "numero da conta: " + numeroConta + ", Titular: '" + titularConta + '\'' + ", saldo: $ " + saldo;
    }


}
