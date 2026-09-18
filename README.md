# Atividades sobre Encapsulamento

Este repositório contém atividades práticas desenvolvidas em **Java** com o objetivo de exercitar conceitos de **Programação Orientada a Objetos (POO)**, principalmente **encapsulamento, atributos privados, getters, setters, validações e métodos**.

---

## 1. Pessoa — Encapsulamento

Adicione mais 3 atributos à classe `Pessoa`:

* `email`
* `telefone`
* `profissao`

### Requisitos

1. Criar os atributos como `private`;
2. Criar os respectivos métodos `get` e `set`;
3. Informar os valores no `main`;
4. Exibir todos os dados da pessoa.

### Desafio

Criar uma segunda pessoa, com dados diferentes, e exibir as informações das duas pessoas.

---

## 2. Cadastro de Alunos

Criar uma classe `Aluno` com os seguintes atributos:

* `nome`
* `matricula`
* `curso`

Utilizar **encapsulamento**.

### No `main`

* Criar dois objetos da classe `Aluno`;
* Cadastrar os dados dos dois alunos;
* Exibir as informações dos dois alunos.

### Desafio

Alterar o curso de um dos alunos utilizando o método:

```java
setCurso()
```

---

## 3. Validação da Idade

Criar uma classe `Pessoa` com o atributo:

```java
private int idade;
```

Criar o método `setIdade()` de forma que a idade seja validada.

### Regras

* Idade maior ou igual a `0` → aceita;
* Idade menor que `0` → não aceita.

### Exemplo

```text
Digite a idade: -5
Idade inválida!
```

Depois, testar também com uma idade válida.

---

## 4. Conta Bancária

Criar uma classe `ContaBancaria` com os atributos:

* `numero`
* `titular`
* `saldo`

Todos os atributos devem ser `private`.

### Métodos

Criar os seguintes métodos:

```java
getNumero()
setNumero()
getTitular()
setTitular()
getSaldo()
```

Para o atributo `saldo`, **não criar `setSaldo()`**.

Criar também os métodos:

```java
depositar()
sacar()
```

### Regras

* O depósito deve ser maior que zero;
* O saque não pode ser maior que o saldo;
* O saldo não pode ficar negativo.

### Exemplo

```text
Titular: Maria
Saldo inicial: R$ 1000
Depósito: R$ 500
Saque: R$ 200
Saldo final: R$ 1300
```

---

## 5. Cadastro de Produto

Criar uma classe `Produto` com os atributos:

* `nome`
* `preco`
* `quantidade`

Utilizar **encapsulamento**.

### Validação do preço

No método `setPreco()`:

* O preço deve ser maior que zero.

### Validação da quantidade

No método `setQuantidade()`:

* A quantidade não pode ser negativa.

### Método `calcularTotal()`

Criar o método:

```java
calcularTotal()
```

O método deve retornar o resultado de:

```text
preço × quantidade
```

### Exemplo

```text
Produto: Teclado
Preço: R$ 100
Quantidade: 3
Total: R$ 300
```

---

## 6. Funcionário e Salário

Criar uma classe `Funcionario` com os atributos:

* `nome`
* `cargo`
* `salario`

### Regras

* O nome não pode ser vazio;
* O salário deve ser maior que zero;
* O salário não pode ser alterado diretamente.

Criar o método:

```java
aumentarSalario(double percentual)
```

O método deve permitir o aumento do salário de acordo com o percentual informado.

### Exemplo

```text
Funcionário: João
Salário: R$ 2000
Aumento: 10%
Novo salário: R$ 2200
```

---

## Conceitos praticados

Durante as atividades foram trabalhados os seguintes conceitos de Java e Programação Orientada a Objetos:

* **Classes e objetos**
* **Encapsulamento**
* **Atributos `private`**
* **Getters e setters**
* **Validação de dados**
* **Métodos**
* **Manipulação de objetos**
* **Regras de negócio**
* **Construtores**
* **Cálculos e operações com atributos**

## Tecnologias

* **Java**
* **Visual Studio Code**
* **Git**
* **GitHub**
