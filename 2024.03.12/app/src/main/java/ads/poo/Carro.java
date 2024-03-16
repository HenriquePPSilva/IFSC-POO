package ads.poo;

public class Carro {
    private int velocidade;

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }

    public Carro(int velocidade){
        if(velocidade > 200 || velocidade < 0){
            this.velocidade = 0;
        }else this.velocidade = velocidade;
    }
    public Carro(){
        this.velocidade = 0;
    }


    public int acelerar(int aumentaVelocidade){
        this.velocidade += aumentaVelocidade;
        if(this.velocidade >= 200) this.velocidade = 200;
        return velocidade;
    }

    public int frear(int desaceleraVelocidade){
        this.velocidade -= desaceleraVelocidade;
        if(this.velocidade < 0) this.velocidade = 0;
        return velocidade;
    }
}
