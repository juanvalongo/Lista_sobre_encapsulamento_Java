package Exercício_4_Conta_Bancária;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    // Getter do número
    public String getNumero() {
        return numero;
    }

    // Setter do número
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getter do titular
    public String getTitular() {
        return titular;
    }

    // Setter do titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para sacar
    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }
}
