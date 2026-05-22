// IMPORTAÇÕES NECESSÁRIAS
// Scanner = entrada de dados pelo teclado
// ArrayList = lista dinâmica do Java
import java.util.Scanner;
import java.util.ArrayList;

// CLASSE PRINCIPAL
public class App{

    // MÉTODO MAIN = ponto inicial do programa
    public static void main(String[] args) {

        // Scanner usado para ler dados digitados
        Scanner sc = new Scanner(System.in);

        // =========================
        // VARIÁVEIS
        // =========================

        // String = texto
        String nome;

        // int = número inteiro
        int idade;

        // double = número decimal
        double altura;

        // boolean = verdadeiro ou falso
        boolean ativo;

        // =========================
        // ENTRADA DE DADOS
        // =========================

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();

        System.out.println("Usuario ativo? true/false");
        ativo = sc.nextBoolean();

        // =========================
        // SAÍDA DE DADOS
        // =========================

        System.out.println("\n===== DADOS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Ativo: " + ativo);

        // =========================
        // IF / ELSE
        // =========================

        // Verifica condição
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // =========================
        // OBJETO DA CLASSE PESSOA
        // =========================

        // Criando objeto
        Pessoa p1 = new Pessoa();

        // Usando SETTERS para alterar atributos
        p1.setNome(nome);

        // Encapsulamento impedindo idade negativa
        p1.setIdade(idade);

        // Mostrando dados
        System.out.println("\n===== OBJETO PESSOA =====");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        // =========================
        // CONSTRUTOR
        // =========================

        // Criando cliente usando construtor
        Cliente c1 = new Cliente("Carlos", true);

        System.out.println("\n===== CLIENTE =====");
        System.out.println("Nome: " + c1.getNome());

        // Chamando método
        if (c1.podeComprarFiado()) {
            System.out.println("Pode comprar fiado");
        } else {
            System.out.println("Nao pode comprar fiado");
        }

        // =========================
        // ARRAYLIST
        // =========================

        // Criando lista dinâmica
        ArrayList<String> listaNomes = new ArrayList<>();

        // Adicionando elementos
        listaNomes.add("Joao");
        listaNomes.add("Maria");
        listaNomes.add("Pedro");

        // Mostrando lista
        System.out.println("\n===== ARRAYLIST =====");

        // FOR usado para percorrer lista
        for (int i = 0; i < listaNomes.size(); i++) {

            // get(i) pega elemento pelo índice
            System.out.println(listaNomes.get(i));
        }

        // Removendo elemento
        listaNomes.remove("Maria");

        System.out.println("\nLista apos remover Maria:");

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }

        // Fechando scanner
        sc.close();
    }
}

// ======================================
// CLASSE PESSOA
// EXEMPLO DE ENCAPSULAMENTO
// ======================================

class Pessoa {

    // private = protege atributos
    // ninguém acessa diretamente
    private String nome;
    private int idade;

    // GET = retorna valor
    public String getNome() {
        return nome;
    }

    // SET = altera valor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // GET da idade
    public int getIdade() {
        return idade;
    }

    // SET da idade
    // impede idade negativa
    public void setIdade(int idade) {

        // validação
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida");
        }
    }
}

// ======================================
// CLASSE CLIENTE
// CONSTRUTOR + MÉTODO
// ======================================

class Cliente {

    // atributos privados
    private String nome;
    private boolean temDivida;

    // CONSTRUTOR
    // executa ao criar objeto
    public Cliente(String nome, boolean temDivida) {

        // this referencia o atributo da classe
        this.nome = nome;
        this.temDivida = temDivida;
    }

    // método GET
    public String getNome() {
        return nome;
    }

    // método que verifica condição
    public boolean podeComprarFiado() {

        // se NÃO tiver dívida
        if (temDivida == false) {
            return true;
        } else {
            return false;
        }
    }
}