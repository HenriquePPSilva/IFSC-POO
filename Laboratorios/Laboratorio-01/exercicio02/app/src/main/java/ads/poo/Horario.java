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
            this.minutos = 0;
            this.segundos = 0;
        }
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
        if(minutos < 0 || minutos > 59){
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }


    public void setSegundos(int segundos) {
        this.segundos = segundos;
        if(segundos < 0  || segundos > 59){
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }
    public String imprimirPorExtenso(){
        String imprimeHorasPorExtenso = converterNumeroParaExtenso(horas)  +  " horas";
        String imprimeMinutosPorExtenso = converterNumeroParaExtenso(minutos) + " minutos";
        String imprimeSegundosPorExtenso = converterNumeroParaExtenso(segundos) + " segundos";
        return imprimeHorasPorExtenso + ", " +  imprimeMinutosPorExtenso + " e " + imprimeSegundosPorExtenso;
    }

    public String converterNumeroParaExtenso(int horas){
        String[] he = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] ms = {"vinte", "trinta", "quarenta", "cinquenta"};
        if(horas < 20){
            return he[horas];
        }else{
            int dezena = horas / 10;
            int unidade = horas % 10;
            return ms[dezena - 2] + " e " + he[unidade];
        }
    }
    public int retornarHorarioEmSegundos(){
        return (horas * 3600) + (minutos * 60) + segundos;
    }

}
