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


    //TEM UM PROBLEMA NO CÓDIGO, QUANDO EU ALTERO A MATRICULA E TENTO EDITAR ALGO PASSANDO A NOVA MATRICULA ELE N RECONHECE
    //EXEMPLO Aluno alisson: matricula - 2023001
    //Editei a matricula para 2023002
    //Fui buscar novamente para editar, mas agora passando 2023002 e ele me retorna que a matricula 2023002 não existe mesmo passando corretamente
    //retorno: 2023001=Aluno{nome='alisson', matricula='2023002', curso='ads', telefone='48998548', email='editei@example.com', dataNascimento=2004-01-01}}
    
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
        System.out.println();
        System.out.print("1 - Cadastrar \n" + "2 - Editar \n" + "3 - Excluir \n" + "4 - Listar dados de um aluno \n" + "5 - Listar todos os alunos \n" + "6 - Sair");
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
        System.out.println();
        System.out.print("Digite a matricula do aluno que quer pesquisar: ");
        String matricula = teclado.nextLine();
        if(!this.bancoDeDadosMap.containsKey(matricula)){
            System.out.println("Matricula não encontrada!");
            System.out.println();
        }else{
            System.out.println(this.bancoDeDadosMap.get(matricula));
            System.out.println();
        }
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
    public void editarAluno(){
        System.out.print("Qual a matrícula do aluno que você quer editar? ");
        String matricula = teclado.nextLine();
        System.out.println("O que você quer editar? \n" + "1 - Nome \n" + "2 - Matricula \n" + "3 - Curso \n" + "4 - Telefone \n" + "5 - Email \n" + "6 - Data de Nascimento");
        int opcao = teclado.nextInt();
        teclado.nextLine();
        if(bancoDeDadosMap.containsKey(matricula)){
            switch (opcao){
                case 1 -> {
                    System.out.print("Qual o novo nome desejado? ");
                    String nome = teclado.nextLine();
                    bancoDeDadosMap.get(matricula).setNome(nome);
                    System.out.println("Nome alterado com sucesso!");
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Qual a nova matricula desejada? ");
                    String matriculaNova = teclado.nextLine();
                    bancoDeDadosMap.get(matricula).setMatricula(matriculaNova);
                    System.out.println("Matricula nova registrada com sucesso!");
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Qual o novo curso ? ");
                    String cursoNovo = teclado.nextLine();
                    bancoDeDadosMap.get(matricula).setCurso(cursoNovo);
                    System.out.println("Curso atualizado!");
                    System.out.println();
                }
                case 4 -> {
                    System.out.print("Qual o novo telefone? ");
                    String telefoneNovo = teclado.nextLine();
                    bancoDeDadosMap.get(matricula).setTelefone(telefoneNovo);
                    System.out.println("Telefone novo registrado com sucesso!");
                    System.out.println();
                }

                case 5 -> {
                    System.out.print("Qual o novo email ? ");
                    String emailNovo = teclado.nextLine();
                    bancoDeDadosMap.get(matricula).setEmail(emailNovo);
                    System.out.println("Email alterado com sucesso!");
                    System.out.println();
                }
                case 6 -> {
                    System.out.print("Qual a nova data desejada? ");
                    String dataString = teclado.nextLine();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate data =  LocalDate.parse(dataString, formato);
                    bancoDeDadosMap.get(matricula).setDataNascimento(data);
                    System.out.println("Data de nascimento nova registrada com sucesso!");
                    System.out.println();
                }

            }
        }else{
            System.out.println();
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
                case 2 -> app.editarAluno();
                case 3 -> {
                    app.removerCadastro();
                }
                case 4 -> {
                    app.listarAluno();
                }
                case 5 -> {
                    app.listarTodos();
                }
                case 6 -> System.out.println("Saindo...");
            }
        }while(opcao != 6);
    }
}
