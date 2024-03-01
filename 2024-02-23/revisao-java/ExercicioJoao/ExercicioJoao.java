import java.util.Scanner;
public class ExercicioJoao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o seu nome: ");
        String nomeUsuario = teclado.nextLine();
        System.out.print("Entre com o ano que nasceu: ");
        int anoNascimento = teclado.nextInt();
        System.out.print("Entre com o ano atual: ");
        int anoAtual = teclado.nextInt();
        
        int idadeUsuario =  anoAtual - anoNascimento;

        System.out.println(nomeUsuario + ", possui " + idadeUsuario + " anos.");
    }
}