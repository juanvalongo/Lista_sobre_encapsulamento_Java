package Exercício_6_Funcionário_e_salário;

public class Main {

    public static void main(String[] args) {

        // Criando o funcionário
        Funcionario funcionario = new Funcionario(
            "João",
            "Desenvolvedor",
            2000
        );

        // Exibindo os dados iniciais
        System.out.println("===== FUNCIONÁRIO =====");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: R$ " + funcionario.getSalario());

        // Aplicando aumento de 10%
        funcionario.aumentarSalario(10);

        // Exibindo o novo salário
        System.out.println("\n===== APÓS O AUMENTO =====");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Novo salário: R$ " + funcionario.getSalario());
    }
}
