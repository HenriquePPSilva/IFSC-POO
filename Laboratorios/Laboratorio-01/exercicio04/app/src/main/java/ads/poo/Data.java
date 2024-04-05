package ads.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        this.dia = 01;
        this.mes = 01;
        this.ano = 1970;
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(int dia, int mes){
        this(dia, mes, 1970);
    }
    public Data(int dia){
        this(dia, 01, 1970);
    }

    public void validarDiaAno(){
        //RECEBE DIA E ANO E JOGA DENTRO DO SWITCH
        switch (this.ano){
            case ano % 4 == 0:

                break;
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
