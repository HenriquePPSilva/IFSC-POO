package ads.poo;

public class Carro {
    // Atributos da classe Carro
    //Quando for declarar atributos imaginar que é uma variável que pode ser acessada em qualquer lugar

    private double velocidade;
    private String modelo;

    //Método

    public void acelerar(double v){
        velocidade += v;
    }

    public double obterVelocidade(){
        return velocidade;
    }

    public void frear(double f){
        velocidade-= f;
    }
}
