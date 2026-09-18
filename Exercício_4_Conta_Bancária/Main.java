package Exercício_4_Conta_Bancária;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        // Cadastro dos dados da conta
        conta.setNumero("001");
        conta.setTitular("Maria");

        // Definindo o saldo inicial através de depósito
        conta.depositar(1000);

        System.out.println("===== CONTA BANCÁRIA =====");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Realizando depósito
        conta.depositar(500);

        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        // Realizando saque
        conta.sacar(200);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
