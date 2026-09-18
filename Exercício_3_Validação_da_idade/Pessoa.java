package Exercício_3_Validação_da_idade;

public class Pessoa {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
