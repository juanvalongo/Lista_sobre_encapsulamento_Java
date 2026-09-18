package Exercício_1;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(25);
        pessoa1.setEmail("joao@email.com");
        pessoa1.setTelefone("(81) 99999-1111");
        pessoa1.setProfissao("Desenvolvedor");

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("Maria");
        pessoa2.setIdade(30);
        pessoa2.setEmail("maria@email.com");
        pessoa2.setTelefone("(81) 98888-2222");
        pessoa2.setProfissao("Professora");

        System.out.println("===== PRIMEIRA PESSOA =====");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("E-mail: " + pessoa1.getEmail());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Profissão: " + pessoa1.getProfissao());

        System.out.println("\n===== SEGUNDA PESSOA =====");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("E-mail: " + pessoa2.getEmail());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        System.out.println("Profissão: " + pessoa2.getProfissao());
    }
}