package SistemaDeGerenciamentoDeCinema;
import java.util.Random;

public class Ingresso {
    private Filme filme;
    private Sessao sessao;
    protected Double preco = 40.00;
    private int id;
    private String nome;
    private int idade;
    private int assento;



    Ingresso (Sessao sessao, String nome, int idade, int assento) {
        this.sessao = sessao;
        this.nome = nome;
        this.idade = idade;
        this.assento = assento;

        this.filme = sessao.getFilme();

        Random gerador = new Random();
        this.id = gerador.nextInt(1000000);
    }

    void ExibirIngresso () {
        System.out.println("---INGRESSO INTEIRA---");
        System.out.println("Nome: "+ this.nome);
        System.out.println("ID: "+ this.id);
        System.out.println("Valor: R$ "+ calcularIngresso());
        System.out.println("Filme: "+ this.filme.getNome());
        System.out.println("Classificação: " + this.filme.getClassificacao());
        System.out.println("Horario: " + this.sessao.getHorario());
        System.out.println("Data: " + this.sessao.getData());
        System.out.println("Assento: " + this.assento);
    }

    public boolean validarIdade() {
        int classificacaoFilme = this.sessao.getFilme().getClassificacao();

        if (this.idade >= classificacaoFilme) {
            return true;
        } else {
            System.out.println("--- BLOQUEADO: Idade (" + this.idade + " anos) abaixo da classificação (" + classificacaoFilme + " anos) ---");
            return false;
        }
    }
    Double calcularIngresso (){
        return this.preco = preco;
    }


    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

