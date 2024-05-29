public abstract class EstadoAgua {
    protected Agua agua;

    public EstadoAgua(Agua agua) {
        this.agua = agua;
    }

    public abstract void descrever();

    public abstract void transportar();

    public abstract void tratar();
}
