import java.util.ArrayList;
import java.util.List;

public class Partida {
    private Time casa;
    private Time visitante;
    private List<Espectador> espectadores;

    public Partida(Time casa, Time visitante) {
        this.casa = casa;
        this.visitante = visitante;
        this.espectadores = new ArrayList<>();
    }

    public void marcarGol(Time time, Jogador jogador) {
        notificar("GOOOOOOOL! É do "+time.getNome()+"! "+jogador.getNome()+"!!!!!!");
    }

    public void gerarResultados() {
        notificar("Acabou!");
    }

    public void notificar(String mensagem) {
        for (Espectador espectador : espectadores)
            espectador.notificar(mensagem);
    }

    public void inscrever(Espectador espectador) {
        espectadores.add(espectador);
    }

    public Time getCasa() {
        return casa;
    }
    public void setCasa(Time casa) {
        this.casa = casa;
    }
    public Time getVisitante() {
        return visitante;
    }
    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    
}
