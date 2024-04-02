package ads.poo;

public class Horario {
    private int horas;
    private int minutos;
    private int segundos;


    public Horario(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    public Horario(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
        setHoras(horas);
        setMinutos(minutos);
        this.segundos = 0;
    }

    public Horario(int horas){
        this.horas = horas;
        setHoras(horas);
    }
    public Horario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }


    public void setHoras(int horas) {
        this.horas = horas;
        if(horas < 0 || horas > 23){
            this.horas = 0;
        }
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
        if(minutos < 0 || minutos > 59){
            this.minutos = 0;
        }
    }


    public void setSegundos(int segundos) {
        this.segundos = segundos;
        if(segundos < 0  || segundos > 59){
            this.segundos = 0;
        }
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }

    public String imprimeHorarioExtenso(){
        String[] he = {};
        return "";
    }

}
