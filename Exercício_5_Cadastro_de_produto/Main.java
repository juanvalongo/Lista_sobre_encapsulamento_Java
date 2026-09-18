package Exercício_5_Cadastro_de_produto;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();

        // Cadastrando os dados
        produto.setNome("Teclado");
        produto.setPreco(100);
        produto.setQuantidade(3);

        // Exibindo os dados
        System.out.println("===== PRODUTO =====");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Total: R$ " + produto.calcularTotal());
    }
}
