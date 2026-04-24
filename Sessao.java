package SistemaDeGerenciamentoDeCinema;

public class Sessao {
    private Filme filme;
    private String data;
    private String horario;
    private String [] lugares = new String[50];
    private Ingresso ingresso;

    public Sessao (Filme filme, String data, String horario) {
        this.filme = filme;
        this.data = data;
        this.horario = horario;
        for (int i = 0; i < lugares.length; i++) {
            this.lugares[i] = "Vazio";
        }
    }

    void ConferirLugares (Ingresso novoIngresso) {
        int assento = novoIngresso.getAssento();
        int indice = assento - 1;

        if (indice >= 0 && indice < lugares.length){
            if (lugares[indice].equals("Vazio")){
                this.lugares[indice] = "Ocupado";
                System.out.println("Lugar " + novoIngresso.getAssento() +" marcado");
            }else {
                System.out.println("Lugar ocupado!");
            }
        } else {
            System.out.println("ERRO: Assento inexistente!");
        }
    }


    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public String[] getLugares() {
        return lugares;
    }

    public void setLugares(String[] lugares) {
        this.lugares = lugares;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
