
package ads.poo;

public class App {

    public static void main(String[] args) {
        Carro ferrari = new Carro(23);
        Carro lamborghini = new Carro(100);
        lamborghini.retornarObjetosCriados(ferrari.getObjetosCriados());
        System.out.println(lamborghini);
    }
}
