public class EstadoGasoso extends EstadoAgua {

    public EstadoGasoso(Agua agua) {
        super(agua);
    }

    @Override
    public void descrever() {
        System.out.println("Água em estado gasoso!");
    }

    @Override
    public void transportar() {
        System.out.println("Transportando via Contêiner criogênico!");
    }

    @Override
    public void tratar() {
        if(agua.getTemperatura() <= 100)
            agua.setEstado(new EstadoLiquido(agua));
    }
    
}