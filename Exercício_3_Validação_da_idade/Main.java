package Exercício_3_Validação_da_idade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        pessoa.setIdade(idade);

        if (idade >= 0) {
            System.out.println("Idade cadastrada: " + pessoa.getIdade());
        }

        scanner.close();
    }
}

