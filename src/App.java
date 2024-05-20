public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador("Jog 1");
        Jogador jogador2 = new Jogador("Jog 2");
        Jogador jogador3 = new Jogador("Jog 3");
        
        Jogador jogador4 = new Jogador("Jog 4");
        Jogador jogador5 = new Jogador("Jog 5");
        Jogador jogador6 = new Jogador("Jog 6");

        Time ferroviario = new Time("Ferroviario");
        ferroviario.adicionarJogador(jogador1);
        ferroviario.adicionarJogador(jogador2);
        ferroviario.adicionarJogador(jogador3);
        
        Time sobral = new Time("Sobral");
        sobral.adicionarJogador(jogador4);
        sobral.adicionarJogador(jogador5);
        sobral.adicionarJogador(jogador6);

        Espectador davi = new Espectador("Davi");
        Espectador rafael = new Espectador("Rafael");

        Partida classico = new Partida(ferroviario, sobral);
        classico.inscrever(davi);
        classico.inscrever(rafael);

        classico.marcarGol(ferroviario, jogador2);
        classico.marcarGol(ferroviario, jogador1);
        classico.marcarGol(ferroviario, jogador3);
        classico.marcarGol(ferroviario, jogador3);
        classico.marcarGol(sobral, jogador4);
        classico.marcarGol(sobral, jogador6);
        classico.marcarGol(sobral, jogador5);
        classico.gerarResultados();
    }
}
