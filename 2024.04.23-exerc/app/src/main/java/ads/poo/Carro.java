package ads.poo;

public class Carro {
    private Motor motor;
    private String modelo;
    private String cor;

    public Carro(String modelo, String cor, Motor motor) {
        this.motor = motor;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}
