package ads.poo;

public class Carro {
    private final int identificador = 0;
    private int objetosCriados = 0;
    private int velocidade;

    private int valor;

    public Carro(int velocidade) {
        setVelocidade(velocidade);
    }
    public int retornarObjetosCriados(int objetosCriados){
        objetosCriados++;
        this.valor = objetosCriados;

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
        return "A sua velocidade atual é de: " + this.velocidade + " e seu identificador é: " + this.objetosCriados;
    }
}
