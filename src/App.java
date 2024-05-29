public class App {
    public static void main(String[] args) throws Exception {
        Agua exemplo = new Agua(200);

        exemplo.descrever();
        exemplo.transportar();
        exemplo.setTemperatura(5);
        exemplo.descrever();
        exemplo.transportar();
        exemplo.setTemperatura(-80);
        exemplo.descrever();
        exemplo.transportar();
    }
}
