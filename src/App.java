public class App {
    public static void main(String[] args) throws Exception {
        Time novo1 = new Time("Ferroviario");
        Time novo2 = novo1.clone();
        Time novo3 = novo1.clone();
        Time novo4 = novo1.clone();
        Time novo5 = novo1.clone();
        
        novo1.setCorCamisa("Verde e Lilás");
        novo1.getJogadores().get(0).setNome("Tsubasa");
        novo1.adicionarJogador(new Jogador("Ninja Jiraya"));
        
        System.out.println(novo1);
        System.out.println(novo2);
        System.out.println(novo3);
        System.out.println(novo4);
        System.out.println(novo5);





        // Jogador jogador1 = new Jogador("Jog 1");
        // Jogador jogador2 = new Jogador("Jog 2");
        // Jogador jogador3 = new Jogador("Jog 3");
        // Jogador jogador4 = new Jogador("Jog 4");
        // Jogador jogador5 = new Jogador("Jog 5");
        // Jogador jogador6 = new Jogador("Jog 6");

        // Time ferroviario = new Time("Ferroviario");
        // ferroviario.adicionarJogador(jogador1);
        // ferroviario.adicionarJogador(jogador2);
        // ferroviario.adicionarJogador(jogador3);
        
        // Time sobral = new Time("Sobral");
        // sobral.adicionarJogador(jogador4);
        // sobral.adicionarJogador(jogador5);
        // sobral.adicionarJogador(jogador6);

        // Espectador davi = new Espectador("Davi");
        // Espectador rafael = new Espectador("Rafael");

        // Partida classico = new Partida(ferroviario, sobral);
        // classico.inscrever(davi);
        // classico.inscrever(rafael);

        // classico.marcarGol(ferroviario, jogador2);
        // classico.marcarGol(ferroviario, jogador1);
        // classico.marcarGol(ferroviario, jogador3);
        // classico.marcarGol(ferroviario, jogador3);
        // classico.marcarGol(sobral, jogador4);
        // classico.marcarGol(sobral, jogador6);
        // classico.marcarGol(sobral, jogador5);
        // classico.gerarResultados();
    }
}
