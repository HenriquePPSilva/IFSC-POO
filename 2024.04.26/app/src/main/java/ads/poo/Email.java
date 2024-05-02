package ads.poo;

public class Email {
    private String rotulo;
    private String valor;

    public Email(String valor, String rotulo) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        String email = "meu.email@dominio.com.br";
        //System.out.println("Email válido? " + email.matches(eR));
        if(!this.valor.matches(eR)){
            this.valor = "";
            return valor;
        }else{
            return this.valor + " - " + this.rotulo;
        }
    }
}
