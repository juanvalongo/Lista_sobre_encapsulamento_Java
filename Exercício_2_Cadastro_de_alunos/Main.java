package Exercício_2_Cadastro_de_alunos;

public class Main {

    public static void main(String[] args) {

        // Criando o primeiro aluno
        Aluno aluno1 = new Aluno();

        aluno1.setNome("João Silva");
        aluno1.setMatricula("2026001");
        aluno1.setCurso("Análise e Desenvolvimento de Sistemas");

        // Criando o segundo aluno
        Aluno aluno2 = new Aluno();

        aluno2.setNome("Maria Santos");
        aluno2.setMatricula("2026002");
        aluno2.setCurso("Engenharia de Software");

        // Exibindo os dados do primeiro aluno
        System.out.println("===== ALUNO 1 =====");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());

        // Exibindo os dados do segundo aluno
        System.out.println("\n===== ALUNO 2 =====");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Curso: " + aluno2.getCurso());

        // Alterando o curso do primeiro aluno
        aluno1.setCurso("Ciência da Computação");

        // Exibindo o curso após a alteração
        System.out.println("\n===== APÓS ALTERAÇÃO =====");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Novo curso: " + aluno1.getCurso());
    }
}
