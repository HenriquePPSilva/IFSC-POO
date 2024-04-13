package ads.poo;

import com.google.errorprone.annotations.FormatMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


//private String nome;
//private String matricula;
//private String curso;
//private String telefone;
//private String email;
//private LocalDate dataNascimento;

public class App {

    //private ArrayList<Aluno> bancoDeDados;

    //Criando um dicionario para melhorar o banco de dados em funcionalidades como: se já tiver a matricula cadastrada de um aluno
    private HashMap<String, Aluno> bancoDeDadosMap;

    private Scanner teclado;

    public App(){
        this.bancoDeDadosMap = new HashMap<>();
        this.teclado = new Scanner(System.in);
    }

    private int menu(){
        int opcao = 0;
        System.out.print("1 - Cadastrar \n" + "2 - Editar \n" + "3 - Excluir \n" + "4 - Listar dados de um aluno \n" + "5 - Listar todos os alunos \n " + "6 - Sair");
        System.out.println();
        opcao = teclado.nextInt();
        teclado.nextLine();
        return opcao;

    }

    private void listarTodos(){
         //TODO fazer um for para percorrer todos os elementos e ficar bonitinho
        System.out.println(this.bancoDeDadosMap);
    }

    private void listarAluno(){
        System.out.print("Digite a matricula do aluno que quer pesquisar: ");
        String matricula = teclado.nextLine();
    }

    private void removerCadastro(){
        //enquanto ele não digita uma matricula correta ele continua no laço
        System.out.print("Digite a matricula do aluno que quer excluir: ");
        String matricula = teclado.nextLine();
        if(this.bancoDeDadosMap.remove(matricula) != null){
            System.out.println("Matricula removida com sucesso!");
        }else{
            System.out.println("Matricula não encontrada!");
        }

    }
    public boolean cadastrarAluno(){
        System.out.print("Qual seu nome? ");
        String nome = teclado.nextLine();
        System.out.print("Qual a sua matricula? ");
        String matricula = teclado.nextLine();
        System.out.print("Qual seu curso? ");
        String curso = teclado.nextLine();
        System.out.print("Qual seu telefone? ");
        String telefone = teclado.nextLine();
        System.out.print("Qual seu email? ");
        String email = teclado.nextLine();
        System.out.print("Qual sua data de nascimento? ");
        String dataString = teclado.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data =  LocalDate.parse(dataString, formato);
        Aluno a = new Aluno(nome, matricula, curso, telefone, email, data);
        if(!this.bancoDeDadosMap.containsKey(matricula)){
            this.bancoDeDadosMap.put(matricula, a);
            return true;
        }

//        return bancoDeDados.add(a);  MUDANDO PARA O MAP(DICIONARIO) com essa função containsKey fornece se a informação se a matricula já esta cadastrada

        return false;
    }
    public static void main(String[] args) {
        App app = new App();
        int opcao;
        do{
            opcao = app.menu();
            switch (opcao){
                case 1 -> {
                    System.out.println("Cadastrando....");
                    app.cadastrarAluno();
                }
                case 3 -> {
                    app.removerCadastro();
                }
                case 4 -> {
                    app.listarAluno();
                }
                case 5 -> {
                    app.listarTodos();
                }
            }
        }while(opcao != 6);
    }
}
