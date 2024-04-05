package ads.poo;

import java.util.Random;

public class Carro {
    private int identificador;
    private int objetosCriados = 1;
    private int velocidade;

    public Carro(int velocidade) {
        setVelocidade(velocidade);
        gerarNumeroIdentificador();
    }
    public int gerarNumeroIdentificador(){
        Random r = new Random();
        return this.identificador = r.nextInt(10);

    }
    public int retornarObjetosCriados(int objetosCriados){
        objetosCriados++;
        this.objetosCriados = objetosCriados;
        return this.objetosCriados;
    }

    public int getObjetosCriados() {
        return objetosCriados;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        if(velocidade > 200 || velocidade < 0){
            this.velocidade = 0;
        }
    }

    @Override
    public String toString() {
        return "A sua velocidade atual é de: " + this.velocidade + " e a quantidade total de objetos instanciados é: " + this.objetosCriados + " e seu identificador é: " + this.identificador;
    }
}
