package SistemaDeGerenciamentoDeCinema;

public class Filme {
    private String nome;
    private String tipoDoFilme;
    private int classificacao;
    private int duracao;

    public Filme (String nome, String tipoDoFilme, int classificacao, int duracao) {
        this.nome = nome;
        this.tipoDoFilme = tipoDoFilme;
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDoFilme() {
        return tipoDoFilme;
    }

    public void setTipoDoFilme(String tipoDoFilme) {
        this.tipoDoFilme = tipoDoFilme;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
