package ads.poo;

import java.time.LocalDate;

public class App {
    private Agenda agenda;
    public App(){
        this.agenda = new Agenda();
    }
    public static void main(String[] args) {
//        LocalDate dataEspecifica = LocalDate.of(2024, 9, 20);
//        Contato c = new Contato("Henrique", "Patricio", dataEspecifica);
//        c.addTelefone("4899854590", "Pessoal");
//        c.addTelefone("48999999999", "Corporativo");
//        c.addEmail("example@gmail.com", "Pessoal");
//        c.addEmail("henriquepatricio2015@hotmail.com", "Corporativo");
//        System.out.println(c);
//        System.out.println();
//
//        c.removeEmail("Pessoal");//REMOVEU O PRIMEIRO EMAIL COM ROTULO PESSOAL - FUNCIONOU
//        c.removeTelefone("Corporativo");//REMOVEU O PRIMEIRO TELEFONE COM ROTULO CORPORATIVO
//        System.out.println(c);
//
//        c.updateEmail("Corporativo", "henriquepatricio2015@hotmail.com", "batatinha@gmail.com"); //FUNCIONOU
//        c.updateTelefone("Pessoal", "4899854590", "5599999999"); //ALTEROU O NUMERO ESPECIFICO COM O ROTULO ESPECIFICO E ADICIONOU O NOVO TELEFONE NO LUGAR - FUNCIONOU
//        System.out.println(c);
//        System.out.println();

//        LocalDate dataEspecifica2 = LocalDate.of(2002, 7, 25);
//        Contato e = new Contato("Erick", "Patricio", dataEspecifica2);
//        e.addTelefone("48000000000", "Pessoal");
//        e.addTelefone("48111111111", "Corporativo");
//        e.addEmail("criciuma@hotmail.com", "Pessoal");
//        e.addEmail("erickpatricio770@gmail.com", "Corporativo");
//        System.out.println(e);
        App app = new App();
        LocalDate dataEspecifica = LocalDate.of(2024, 9, 20);
        app.agenda.addContato(new Contato("Henrique", "Patricio", dataEspecifica));

        LocalDate dataEspecifica2 = LocalDate.of(2002, 7, 25);
        app.agenda.addContato(new Contato("Erick", "Patricio", dataEspecifica2));



    }
}
