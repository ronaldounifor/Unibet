public class Espectador {
    private String nome;

    public void notificar(String mensagem) {
        System.out.println("Espectador '"+nome+"' recebeu a atualização: "+mensagem);
    }

    public Espectador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
