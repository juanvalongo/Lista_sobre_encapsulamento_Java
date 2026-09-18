package Exercício_5_Cadastro_de_produto;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    // Getter e Setter do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter do preço
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    // Getter e Setter da quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    // Método para calcular o total
    public double calcularTotal() {
        return preco * quantidade;
    }
}
