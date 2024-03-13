package ads.poo;

public class Caneta {
    private String cor = "Preta";
    private int tinta = 100;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }

    public String desenhar(){
        //TODO é uma prática para comentários, assim você sabe o que tem a fazer ainda. Aparece em um icone parecido com uma arvore
        tinta--;
        if(tinta == 0){
            return "Acabou a tinta da caneta " + cor + ", porfavor selecione outra!";
        }
        return "Estou desenhando com a caneta " + cor + "!";
    }


}
