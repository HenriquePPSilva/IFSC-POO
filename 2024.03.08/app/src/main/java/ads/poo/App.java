package ads.poo;

public class App {
    public static void main(String[] args) {
        Carro c = new Carro();
        Carro d = new Carro();

        System.out.println("Velocidade: " + c.obterVelocidade());

        c.acelerar(10);

        System.out.println("Velocidade: " + c.obterVelocidade());

        
    }
}
