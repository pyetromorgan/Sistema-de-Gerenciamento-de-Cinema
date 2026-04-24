package SistemaDeGerenciamentoDeCinema;

public class Bilheteria {

    public void RealizarVendas (Sessao sessao, String nome, int idade, int assento, boolean pedirMeia) {
        String verFilme = sessao.getFilme().getNome();
        String verTipo = sessao.getFilme().getTipoDoFilme();
        int verClassificacao = sessao.getFilme().getClassificacao();
        System.out.println("Comprar ingressos para "+ verFilme);

        Ingresso novo;
        if (pedirMeia){
            novo = new IngressoMeia(sessao, nome, idade, assento);
        }else {
            novo = new Ingresso(sessao, nome, idade, assento);
        }

        if (novo.validarIdade()){
            sessao.ConferirLugares(novo);
            System.out.println("Compra finalizada!");
            novo.ExibirIngresso();
        }else {
            System.out.println("ERRO: Idade não atendida para este ingresso");
        }


    }

}
