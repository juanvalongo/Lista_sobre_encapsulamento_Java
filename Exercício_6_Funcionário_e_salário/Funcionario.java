package Exercício_6_Funcionário_e_salário;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {

        setNome(nome);
        this.cargo = cargo;

        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido!");
        }
    }

    // Getter e Setter do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    // Getter e Setter do cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter do salário
    public double getSalario() {
        return salario;
    }

    // Não existe setSalario()

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) {

        if (percentual > 0) {
            salario = salario + (salario * percentual / 100);
        } else {
            System.out.println("Percentual inválido!");
        }
    }
}