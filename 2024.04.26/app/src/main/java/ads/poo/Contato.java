package ads.poo;

import java.time.LocalDate;
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
    public boolean removeTelefone(String r, int id){
        return this.telefones.removeIf(elemento -> elemento)
    }
}
