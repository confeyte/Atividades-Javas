public class Pessoa {

    // atributos privados
    private String nome;
    private int idade;

    // =====================================
    // CONSTRUTOR VAZIO
    // =====================================

    // usado quando cria:
    // Pessoa p1 = new Pessoa();

    public Pessoa() {

    }

    // =====================================
    // CONSTRUTOR COM PARÂMETROS
    // =====================================

    // usado quando cria:
    // Pessoa p1 = new Pessoa("Carlos", 20);

    public Pessoa(String nome, int idade) {

        // salva valores recebidos
        this.nome = nome;
        this.idade = idade;
    }

    // getter nome
    public String getNome() {
        return nome;
    }

    // setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // getter idade
    public int getIdade() {
        return idade;
    }

    // setter idade
    public void setIdade(int idade) {
        this.idade = idade;


   // ---------------------------------------------------------------



 // CLASSE Pessoa
// Classe = molde para criar objetos

public class Pessoa {

    // private = atributo protegido
    // outras classes NÃO conseguem acessar diretamente
    private String nome;
    private int idade;

    // =====================================
    // GETTER DO NOME
    // =====================================

    // public = pode ser usado em outras classes
    // String = o método vai RETORNAR um texto

    public String getNome() {

        // return devolve o valor do atributo nome
        return nome;
    }

    // =====================================
    // SETTER DO NOME
    // =====================================

    // void = não retorna nada
    // String nome = valor recebido no método

    public void setNome(String nome) {

        // this.nome = atributo da classe
        // nome = valor recebido no método

        this.nome = nome;
    }

    // =====================================
    // GETTER DA IDADE
    // =====================================

    // int = retorna número inteiro

    public int getIdade() {

        // devolve idade
        return idade;
    }

    // =====================================
    // SETTER DA IDADE
    // =====================================

    // void = apenas altera valor
    // não retorna nada

    public void setIdade(int idade) {

        // validação
        // impede idade negativa

        if (idade >= 0) {

            // salva idade no atributo
            this.idade = idade;

        } else {

            // executa se idade for inválida
            System.out.println("Idade invalida");
        }
    }
}
    }
}