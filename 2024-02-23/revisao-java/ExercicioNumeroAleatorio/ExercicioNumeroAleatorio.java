import java.util.Scanner;

public class ExercicioNumeroAleatorio {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int numeroaleatorio = (int) Math.round(Math.random() * 100 + 1);
        int numeroEscolhido;
        int[] arrayTentativas = new int[100];
        int tentativas = 1;
        do{
            System.out.print("Escolha um valor de 0 a 100: ");
            numeroEscolhido = teclado.nextInt();
            System.out.println(numeroaleatorio);
            for(int c = 0; c < arrayTentativas.length; c++){
                if(numeroaleatorio == numeroEscolhido){
                    break;
                }else if(arrayTentativas[c] == numeroEscolhido){
                    System.out.println("O número " + numeroEscolhido + " já foi escolhido " + tentativas + " vezes. Tente novamente!");
                    tentativas++;
                    break;
                }else{
                    System.out.println("Número incorreto, tente novamente!");
                    arrayTentativas[c] = numeroEscolhido;
                    break;
                }
            }
        }while(numeroaleatorio != numeroEscolhido);
        System.out.println("Parabéns, você acertou o número aleatório. Que era: " + numeroaleatorio);
        teclado.close();
    }
}
