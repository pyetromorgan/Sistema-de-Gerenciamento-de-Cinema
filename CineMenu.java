package SistemaDeGerenciamentoDeCinema;

import java.util.Scanner;

public class CineMenu {
    private boolean continuar = true;
    private Bilheteria bilheteria = new Bilheteria();
    private Catalogo catalogo = new Catalogo();
    private Scanner escolher = new Scanner(System.in);

    public CineMenu () {
        //criar filme
        Filme filme1 = new Filme("Vingadores Doomsday", "Ficção científica/Ação", 13,225);
        Filme filme2 = new Filme("Invocação do Mal 4: O Último Ritual", "Terror", 16, 135);
        Filme filme3 = new Filme("Maldição da Múmia", "Terror/Terror sobrenatural", 18, 135);

        //sessao
        catalogo.adicionarFilme(new Sessao(filme1, "04/05","19:30"));
        catalogo.adicionarFilme(new Sessao(filme2, "23/04","20:00"));
        catalogo.adicionarFilme(new Sessao(filme3, "02/05","21:00"));
    }

    public void ExbirMenu () {
        while (continuar == true) {
            System.out.println("---MENU---");
            System.out.println("1 - Ver Filmes/n");
            System.out.println("2 - Comprar Ingressos");
            System.out.println("3 - Sair");
            System.out.println("Escolha: ");
            int pedir = escolher.nextInt();

            switch (pedir) {
                case 1:
                    catalogo.listarFilmes();
                    break;
                case 2:
                    catalogo.listarFilmes();
                    System.out.println("Escolha o número do filme: ");
                    // para pegar a posição 0
                    int indice = escolher.nextInt() - 1;
                    escolher.nextLine();
                    if (indice >= 0 && indice < catalogo.getSessoes().size()) {
                        Sessao sessaoSelecionada = catalogo.getSessoes().get(indice);

                        System.out.print("Nome: ");
                        String nome = escolher.nextLine();
                        System.out.print("Idade: ");
                        int idade = escolher.nextInt();
                        System.out.print("Assento: ");
                        int assento = escolher.nextInt();
                        System.out.print("Meia-entrada? (1-Sim / 2-Não): ");
                        boolean pedirMeia = (escolher.nextInt() == 1);

                        bilheteria.RealizarVendas(sessaoSelecionada, nome, idade, assento, pedirMeia);
                    } else {
                        System.out.println("Opção de filme inválida!");
                    }
                    break;

                case 3:
                    System.out.println("Fechando Menu...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }


        }
    }
}
