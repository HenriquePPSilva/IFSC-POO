package ads.poo;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public double distancia(Ponto p){
        //Math.sqrt((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y))*((this.y - p.y))
        double valorDiferencaX = (this.x - p.x);
        double valorDiferencaY = y = (this.y - p.y);
        return Math.sqrt(Math.pow(valorDiferencaX, 2) + Math.pow(valorDiferencaY,2));
    }
}
