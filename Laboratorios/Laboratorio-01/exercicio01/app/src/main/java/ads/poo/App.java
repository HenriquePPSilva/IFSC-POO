package ads.poo;

public class App {
    public static void main(String[] args) {
        /**
         * como chamar o ponto de um para calcular no outro
         * Ponto p = new Ponto('x', 'y');
         * Ponto q = new Ponto('x', 'y');
         *
         * p.distancia(q)
         *
         * desta forma ele acessa os atributos this.x e this.y que seriam do p e passa os pontos de q (x e y) como parametro
         * desta forma consegue-se calcular a distancia dos dois
         */
        Ponto q = new Ponto(2, 4);
        System.out.println();
        Ponto p = new Ponto(3, 5);
        System.out.println(q.toString());
        System.out.println(p.toString());
        System.out.println(q.distancia(p));
        q.setX(9);
        q.setY(2);
        p.setX(1);
        p.setY(7);
        System.out.println(q.toString());
        System.out.println(p.toString());
        System.out.println(q.distancia(p));


    }
}
