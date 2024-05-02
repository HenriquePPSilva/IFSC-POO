package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    private Agenda agenda;
    private Scanner teclado;
    public App(){
        this.agenda = new Agenda();
        this.teclado = new Scanner(System.in);
    }

    public int menuCadastro(){
        int opcao = 0;
        System.out.println();
        System.out.print("1 - Adicionar Contato \n" + "2 - Remover Contato \n" + "3 - Editar dados de um contato \n"+ "4 - Mostrar todos Contatos \n" + "5 - Sair \n");
        System.out.println();
        opcao = teclado.nextInt();
        teclado.nextLine();
        return opcao;

    }
    public int menuEdita(){
        int opcao = 0;
        System.out.print("1 - Adicionar telefone \n" + "2 - Adicionar email \n" + "3 - Alterar Telefone \n" + "4 - Alterar Email \n" + "5 - Remover Telefone \n" + "6 - Remover Email \n");
        opcao = teclado.nextInt();
        teclado.nextLine();
        return opcao;
    }
    public int mostrarContatos() {
        System.out.println("De qual contato? Escolha: ");
        int contador = 0;
        for (Contato c : agenda.getContatos()) {
            System.out.println(contador + " - " + c);
        }
        int indexContato = teclado.nextInt();
        teclado.nextLine();
        return indexContato;
    }
    public static void main(String[] args) {
        App app = new App();
        int opcao;
        do{
            opcao = app.menuCadastro();
            switch (opcao){
                case 1 -> {
                    System.out.println("Cadastrando Contato...");
                    System.out.print("Qual o nome do contato?");
                    String nome = app.teclado.nextLine();
                    System.out.print("Qual o sobrenome do " + nome + "?");
                    String sobrenome = app.teclado.nextLine();
                    System.out.print("Qual a data de nascimento do " + nome + "? [dd/mm/yyyy]");
                    String dataString = app.teclado.nextLine();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate data =  LocalDate.parse(dataString, formato);
                    app.agenda.addContato(new Contato(nome, sobrenome, data));
                }
                case 2 -> {
                    System.out.println("Removendo Contato...");
                    System.out.print("Qual é no nome do contato que quer excluir?");
                    String nome = app.teclado.nextLine();
                    System.out.print("Qual o sobrenome do " + nome + "?");
                    String sobrenome = app.teclado.nextLine();
                    app.agenda.removeContato(nome, sobrenome);
                }
                case 3 -> {
                    int opcaoCadastro = app.menuEdita();
                    switch (opcaoCadastro) {
                        case 1 -> {
                            System.out.print("Qual o número de telefone?");
                            String numero = app.teclado.nextLine();
                            System.out.print("Qual rótulo você deseja vincular?");
                            String rotulo = app.teclado.nextLine();
                            int contatoEscolhido = app.mostrarContatos();
                            app.agenda.addTelefone(numero, rotulo, app.agenda.getContatos().get(contatoEscolhido));
                        }
                        case 2 -> {
                            System.out.print("Qual o email?");
                            String email = app.teclado.nextLine();
                            System.out.print("Qual o rotulo? ");
                            String rotulo = app.teclado.nextLine();
                            int contatoEscolhido = app.mostrarContatos();
                            app.agenda.addEmail(email, rotulo, app.agenda.getContatos().get(contatoEscolhido));
                        }
                        case 3 -> {
                            //Mostro primeiro os contatos e ele escolhe qual o telefone que quer alterar de qual contato
                            int contatoEscolhido = app.mostrarContatos();
                            System.out.print("Informe o número que você quer alterar: ");
                            String numero = app.teclado.nextLine();
                            System.out.print("Informe o rótulo do número que você quer alterar: ");
                            String rotulo = app.teclado.nextLine();
                            System.out.print("Qual o novo número de telefone?");
                            String novoNumero = app.teclado.nextLine();
                            app.agenda.updateTelefone(numero, rotulo, novoNumero, app.agenda.getContatos().get(contatoEscolhido));
                        }
                        case 4 -> {
                            //Mostro primeiro os contatos e ele escolhe qual o email que quer alterar de qual contato
                            int contatoEscolhido = app.mostrarContatos();
                            System.out.print("Informe o email que você quer alterar: ");
                            String email = app.teclado.nextLine();
                            System.out.print("Informe o rótulo deste email: ");
                            String rotulo = app.teclado.nextLine();
                            System.out.print("Qual o novo email ?");
                            String emailNovo = app.teclado.nextLine();
                            app.agenda.updateEmail(email, rotulo, emailNovo, app.agenda.getContatos().get(contatoEscolhido));
                        }
                        case 5 -> {
                            int contatoEscolhido = app.mostrarContatos();
                            //Vai excluir o primeiro telefone com o rótulo passado abaixo
                            System.out.print("Qual é o rótulo do telefone que você quer excluir? ");
                            String rotulo = app.teclado.nextLine();
                            app.agenda.removeTelefone(rotulo, app.agenda.getContatos().get(contatoEscolhido));
                        }
                        case 6 -> {
                            int contatoEscolhido = app.mostrarContatos();
                            //Vai excluir o primeiro telefone com o rótulo passado abaixo
                            System.out.print("Qual é o rótulo do email que você quer excluir? ");
                            String rotulo = app.teclado.nextLine();
                            app.agenda.removeTelefone(rotulo, app.agenda.getContatos().get(contatoEscolhido));
                        }
                    }
                }
                case 4 -> System.out.println(app.agenda);
                case 5 -> System.out.println("Saindo...");
            }
        }while(opcao != 5);
    }
}
