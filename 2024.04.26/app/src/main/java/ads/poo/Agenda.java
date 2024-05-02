package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    public Agenda() {
        this.contatos = new ArrayList<>();
    }
    public boolean addContato(Contato c){
        return this.contatos.add(c);
    }
    public boolean removeContato(String n, String s){
        for(Contato e : contatos){
            if(e.getNome().equals(n) && e.getSobrenome().equals(s)){
                contatos.remove(e);
                return true;
            }
        }
        return false;
    }
    public boolean addTelefone(String n, String r, Contato c){
        return c.addTelefone(n, r);
    }
    public boolean addEmail(String n, String r, Contato c){
        return c.addEmail(n, r);
    }
    public boolean updateTelefone(String n, String r, String telefoneNovo, Contato c){
        return c.updateTelefone(n, r, telefoneNovo);
    }
    public boolean updateEmail(String n, String r, String emailNovo, Contato c){
        return c.updateEmail(n, r, emailNovo);
    }
    public boolean removeTelefone(String r, Contato c){
        return c.removeTelefone(r);
    }
    public boolean removeEmail(String r, Contato c){
        return c.removeEmail(r);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
