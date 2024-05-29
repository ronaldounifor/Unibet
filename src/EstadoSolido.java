public class EstadoSolido extends EstadoAgua {

    public EstadoSolido(Agua agua) {
        super(agua);
    }

    @Override
    public void descrever() {
        System.out.println("Água em estado sólido!");
    }

    @Override
    public void transportar() {
        System.out.println("Transportando via Caminhões refrigerados!");
    }

    @Override
    public void tratar() {
        if(agua.getTemperatura() > 0)
            agua.setEstado(new EstadoLiquido(agua));
    }
    
}