package SistemaDeGerenciamentoDeCinema;

public class IngressoMeia extends Ingresso{
    IngressoMeia (Sessao sessao, String nome, int idade, int assento){
        super(sessao, nome, idade, assento);
    }

    @Override
    public boolean validarIdade () {
        if (this.getIdade() < 18){
            return true;
        }else {
            System.out.println("Idade não permitida para meia-entrada!");
            return false;
        }
    }

    @Override
    Double calcularIngresso () {
        return this.preco / 2;
    }

    @Override
    void ExibirIngresso () {
        System.out.println("---INGRESSO MEIA---");
        System.out.println("Nome: "+ getNome());
        System.out.println("ID: "+ getId());
        System.out.println("Valor: R$ "+ calcularIngresso());
        System.out.println("Filme: "+ getFilme().getNome());
        System.out.println("Classificação: " + getFilme().getClassificacao());
        System.out.println("Horario: " + getSessao().getHorario());
        System.out.println("Data: " + getSessao().getData());
        System.out.println("Assento: " + getAssento());
    }

}
