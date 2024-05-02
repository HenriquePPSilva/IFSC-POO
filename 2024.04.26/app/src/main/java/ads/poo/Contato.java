package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public boolean addTelefone(String n, String r){
        Telefone telefone = new Telefone(n, r);
        return this.telefones.add(telefone);
    }
    public boolean addEmail(String n, String r){
        Email email = new Email(n, r);
        return  this.emails.add(email);
    }
    //FAZER UM FOR E CADA INDICE INDICA UM ELEMENTO DO ARRAYLIST(NO APP), PECO PARA ELE ESCOLHER UM DELES PARA REMOVER
    public boolean removeTelefone(String r){//ESTE int id é para fazer a implementação do for mostrando qual email/telefone o usuário quer excluir
        return this.telefones.removeIf(elemento -> elemento.getRotulo().equals(r));
    }
    public boolean removeEmail(String r){ //ESTE int id é para fazer a implementação do for mostrando qual email/telefone o usuário quer excluir
        return this.emails.removeIf(elemento -> elemento.getRotulo().equals(r));
    }
    //Esta forma de updateEmail/Telefone é necessário que o usuário possa ver qual email ele quer alterar, e que ele passe o telefone novo
    public boolean updateTelefone(String n, String r, String telefoneNovo){
        for(Telefone telefone : telefones){
            if(telefone.getRotulo().equals(r) && telefone.getValor().equals(n)){
                telefone.setValor(telefoneNovo);
                return true;
            }
        }
        return false;
    }
    //Esta forma de updateEmail/Telefone é necessário que o usuário possa ver qual email ele quer alterar, e que ele passe o telefone novo
    public boolean updateEmail(String n, String r, String emailNovo){
        for (Email email : emails){
            if(email.getRotulo().equals(r) && email.getValor().equals(n)){
                email.setValor(emailNovo);
                return true;
            }
        }
        return false;
    }
    public String formataData(){
        // Definindo o formato desejado para a data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formatando o objeto LocalDate como uma string
        return dataNasc.format(formato);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + formataData() +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
