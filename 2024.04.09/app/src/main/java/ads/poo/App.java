
package ads.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class App {
        //EXPLICAÇÃO SOBRE AS API COLLECTIONS
    public static void main(String[] args) {
        //<String> Significa que é uma lista de array de String
        //ArrayList diz que é um array mas n define limite, pois quando chega a 80% de uso do array ele dobra seu tamanho
        ArrayList<String> nomes = new ArrayList<>();

        String s = "juca";

        nomes.add(s);

        //FORMA SEM TER QUE CRIAR UMA VARIAVEL PARA ADICIONAR
        nomes.add("Henrique");


        //MOSTRA o arrayList nomes
        //System.out.println(nomes);

        //MOSTRA A QUANTIDADE DE ELEMENTOS DO ARRAYLIST
        //nomes.size();
        //System.out.println(nomes.size());


        //Condiciona se a lista não estiver vazia, então ela vai esvaziar
        //if(!nomes.isEmpty()){
        //    nomes.clear();
        //}

        //remove um elemento especifico
        //nomes.remove("juca");

        //remove pela posição do elemento
        //int pos = nomes.indexOf("Juca");
        //nomes.remove(pos);

        //forma o arrayList nomes para um vetor normal String[]
        //String[] v = (String[]) nomes.toArray();

        //para pegar um elemento especifico de um array usar .get('posicao que quiser do array')
        //nomes.get(1) //retorna Henrique

        //forma que eu fiz para retornar todos os elementos do meu arrayList
        //for(int c = 0; c < nomes.size(); c++){
        //System.out.println("Nomes: " + nomes.get(c));
        //}

        //forma correta de fazer (usando for each)

        //for(String elemento : nomes){
            //System.out.println("Nomes: " + elemento);
        //}
        //}

        //foreach direto do arrayList

        //-> significa lambda

        //quando tem uma instrução apenas
        //nomes.forEach(elemento-> System.out.println("Nome: " + elemento));

        //quando tem mais de uma instrução (mesma coisa q a anterior)
//        nomes.forEach(elemento-> {
//            System.out.println("Nome: " + elemento);
//            System.out.println("qualquer outra coisa");
//        });

        //metodo reference
        //nomes.forEach(System.out::println);

        /*
        * pede numero para o usuario
        * guarda na colecao
        * se digitar 999 - nao guarda // para o loop
        * imprime de forma ordenada
        * */

//        Scanner teclado = new Scanner(System.in);
//        ArrayList<Integer> array = new ArrayList<>();
//        int numeroProibido;
//        do{
//            numeroProibido = teclado.nextInt();
//            if(numeroProibido != 999){
//                array.add(numeroProibido);
//            }
//        }while(numeroProibido != 999);
//
//        Collections.sort(array);
//
//        System.out.println(array);

        /*
        * tem que imprimir os numeros de forma inverso
        * nao usar o arrayList
        * */

        Scanner teclado = new Scanner(System.in);
        Stack<Integer> array = new Stack<>();
        int numeroProibido;
        do{
            numeroProibido = teclado.nextInt();
            if(numeroProibido != 999){
                array.add(numeroProibido);
            }
        }while(numeroProibido != 999);

        while(!array.isEmpty()){
            System.out.println(array.pop());
        }
        
        System.out.println(array);



    }
}
