package SistemaDeGerenciamentoDeCinema;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Sessao> sessoes;

    public Catalogo () {
        this.sessoes = new ArrayList<>();
    }

    public void adicionarFilme (Sessao sessao) {
        this.sessoes.add(sessao);
    }

    public void listarFilmes () {
        for (int i = 0; i < sessoes.size(); i++) {
            String nomeFilme = sessoes.get(i).getFilme().getNome();
            //i + 1 para começar no 1
            System.out.println((i + 1) + " - "+nomeFilme);
        }
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}
