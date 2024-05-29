public class Agua {
    private int temperatura;
    private EstadoAgua estado;
    
    public Agua(int temperatura) {
        this.estado = new EstadoLiquido(this);
        setTemperatura(temperatura);
    }
    
    public void descrever() {
        estado.descrever();
    }
    public void transportar() {
        estado.transportar();
    }
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        estado.tratar();
    }
    public EstadoAgua getEstado() {
        return estado;
    }
    public void setEstado(EstadoAgua estado) {
        this.estado = estado;
    }
}