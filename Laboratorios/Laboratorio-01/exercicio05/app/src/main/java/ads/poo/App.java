
package ads.poo;

public class App {

    public static void main(String[] args) {
        Carro ferrari = new Carro(23);
        Carro lamborghini = new Carro(100);
        Carro fusca = new Carro(234);
        lamborghini.retornarObjetosCriados(ferrari.getObjetosCriados());
        fusca.retornarObjetosCriados(lamborghini.getObjetosCriados());
        System.out.println(ferrari);
        System.out.println(lamborghini);
        System.out.println(fusca);


    }
}
