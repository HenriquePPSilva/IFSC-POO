package ads.poo;

public class Carro {
    private int velocidade;

    /*
    * Para criar uma variavel constante é private final 'NOME DA VARIAVEL'; nome sempre em caixa alta (convensão entre os devs)
    * Mudar o 200 (antiga vel max, que estava onde estão as VEL_MAX agora) que é uma regra de negócio pré estabelecida pelo cliente para uma constante.
    * Para acessar variaveis não estaveis em funções estaveis basta instaciar um objeto da classe desejada e chamala como um atributo
    *
    *
    * class App{
    *   private int fatorial(int n){
     *      return -1;
     *  }
     *
     *  public static void main(String[] args){
     *      App a = new App();
     *
     *      int resposta = a.fatorial(4); AQUI ELE ESTÁ ACESSANDO A VARIAVEL NÃO ESTATICA EM UM FUNCAO ESTATICA USANDO a.fatorial(4
     *
     *  }
    * }
    *
    *
    * */

    private final int VEL_MAX = 100;
    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }

    public Carro(int velocidade){
        if(velocidade > VEL_MAX || velocidade < 0){
            this.velocidade = 0;
        }else this.velocidade = velocidade;
    }
    public Carro(){
        this.velocidade = 0;
    }


    public int acelerar(int aumentaVelocidade){
        this.velocidade += aumentaVelocidade;
        if(this.velocidade >= VEL_MAX) this.velocidade = VEL_MAX;
        return velocidade;
    }

    public int frear(int desaceleraVelocidade){
        this.velocidade -= desaceleraVelocidade;
        if(this.velocidade < 0) this.velocidade = 0;
        return velocidade;
    }
}
