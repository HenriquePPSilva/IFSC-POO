package ads.poo;

public class Horario {
    private int horas;
    private int minutos;
    private int segundos;


    public Horario(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        //SET HORAS
        //SET MINUTOS
        //SET SEGUNDOS
        //ISSO PARA TESTAR AS VARIAVEIS, CASO N CORRESPONDAM COM AS COISA ELE REFAZ AS VARIAVEIS
    }
    public Horario(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = 0;
    }

    public Horario(int horas){
        this.horas = horas;
    }


    public void setHoras(int horas) {
        this.horas = horas;
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Horario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }



}
