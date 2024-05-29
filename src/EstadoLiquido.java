public class EstadoLiquido extends EstadoAgua {

    public EstadoLiquido(Agua agua) {
        super(agua);
    }

    @Override
    public void descrever() {
        System.out.println("Água em estado líquido!");
    }

    @Override
    public void transportar() {
        System.out.println("Transportando via Tanques!");
    }

    @Override
    public void tratar() {
        if(agua.getTemperatura() < 0)
            agua.setEstado(new EstadoSolido(agua));
        
        if(agua.getTemperatura() > 100)
            agua.setEstado(new EstadoGasoso(agua));
    }
    
}
