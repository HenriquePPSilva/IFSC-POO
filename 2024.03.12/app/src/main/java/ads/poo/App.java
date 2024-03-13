package ads.poo;

import org.checkerframework.checker.units.qual.C;

public class App {
    public static void main(String[] args) {
//        Buzz b = new Buzz();
//
//        String s = b.lazers();
//        System.out.println(s);
//
//        System.out.println("Capacete aberto? " + b.capaceteRetratil());
//        b.capaceteRetratil();
//        System.out.println("Capacete aberto? " + b.isCapaceteAberto());
//
//        Buzz malvado = new Buzz();
//
//        System.out.println("Capace aberto? " + malvado.capaceteRetratil());

//        Caneta canetaPreta = new Caneta();
//
//        canetaPreta.setCor("Verde");
//        System.out.println(canetaPreta.getCor());
        Pessoa pessoa = new Pessoa();

        pessoa.setCpf("123.456.789.30");
        pessoa.setNome("Juca");
        pessoa.setEmail("juca@example.org");

        System.out.println(pessoa);
    }
}