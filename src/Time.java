import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores;
    private String corCamisa;
    
    
    public Time() {
    }
    
    public Time(String nome) {
        this.nome = nome;
        gerarEscalacao();
    }
    
    private void gerarEscalacao() {
        this.jogadores = new ArrayList<>();
        
        for (int i = 1; i <= 11; i++)
            jogadores.add(new Jogador("Jog "+i));
        
        this.corCamisa = "Preto, vermelho e branco";
        
        // Feito pelo copilot - Nossa simulação de delay para acessar essas informações no DB
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Sleep was interrupted");
        }
    }

    public String getCorCamisa() {
        return corCamisa;
    }

    public void setCorCamisa(String corCamisa) {
        this.corCamisa = corCamisa;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public Time clone() {
        Time novo = new Time();

        novo.setCorCamisa(this.corCamisa);
        novo.setNome(this.nome);

        ArrayList<Jogador> novoTime = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            Jogador novoJogador = new Jogador(jogador.getNome());
            novoTime.add(novoJogador);
        }

        novo.setJogadores(novoTime);

        return novo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("########## Informações sobre ").append(nome).append("##########").append("\n");
        builder.append("## Lista de Jogadores: ##").append("\n");
        for (Jogador jogador : jogadores)
            builder.append(jogador.getNome()).append("  ");
        
        builder.append("\n").append("## Cor da camisa: ").append(corCamisa).append("\n");
        return builder.toString();
    }
}
