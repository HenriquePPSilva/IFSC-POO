package ads.poo;

public class Data {

    //TODO FAZER A DIFERENÇA ENTRE DATAS - ULTIMO PONTO DESSE EXERCICIO

    private int dia;
    private int mes;
    private int ano;
    private boolean resultadoTesteBissesto;

    private int maximoDeDiasDoMes;

    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
        validarAno();
        validarMes();
        validarDias();
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarAno();
        validarMes();
        validarDias();

    }
    public Data(int dia, int mes){
        this(dia, mes, 1970);
        validarAno();
        validarMes();
        validarDias();
    }

    public Data(int dia){
        this(dia, 1, 1970);
        validarAno();
        validarMes();
        validarDias();
    }


    // Essa função funciona como testador para o método validarMes(), onde aqui retorna se o ano digitado é bissesto ou não. Declarei como private pois não é um método que o usuário precisa acessar.
    private boolean validarAno(){
        if((ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) || (ano % 4 == 0 && ano % 100 > 0)){
            return this.resultadoTesteBissesto = true;
        } else{
            return this.resultadoTesteBissesto = false;
        }
    }

    /*
    * Recebe o resultado do metodo validarAno(), que consiste em validar se o ano é bissesto ou não.
    * E então, validarMes() faz a função de definir os dias máximos de cada mês, dessa forma consegue-se acessar e definir um limite para cada dia.
    */
    private void validarMes(){
        if(resultadoTesteBissesto){
            switch(this.mes){
                case 1, 5, 7, 8, 3, 10, 12:
                    maximoDeDiasDoMes = 31;
                    break;
                case 2:
                    maximoDeDiasDoMes = 29;
                    break;
                case 4, 6, 9, 11:
                    maximoDeDiasDoMes = 30;
                    break;
                default:
                    //CASO O USUARIO DIGITE ALGO DIFERENTE DE UM MÊS VALIDO ELE TRANSFORMA NO PADRÃO: 01/01/1970
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 1970;
                    break;
            }
        }else{
            switch(this.mes){
                case 1, 5, 7, 8, 3, 10, 12:
                    maximoDeDiasDoMes = 31;
                    break;
                case 2:
                    maximoDeDiasDoMes = 28;
                    break;
                case 4, 6, 9, 11:
                    maximoDeDiasDoMes = 30;
                    break;
                default:
                    //CASO O USUARIO DIGITE ALGO DIFERENTE DE UM MÊS VALIDO ELE TRANSFORMA NO PADRÃO: 01/01/1970
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 1970;
                    break;
            }
        }
    }

    /*
    * Este método validarDias() verifica caso o dia escolhido ultrapasse o limite de dias do seu mês, caso ultrapasse ele definirá tudo como 0.
    * Estou usando o padrão 00/00/0000, mas vou mudar para 01/01/1970 - Padrão proposto pelo professor
    * */

    public boolean validarDias(){
        if(dia > maximoDeDiasDoMes) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
            return false;
        }
        return true;
    }

    /*
    * Usa o metodo imprimirDataPorExtenso() e o converterDataParaExtenso() para transformar a data em extenso, mesmo que o usuário coloque
    * uma data que não existe, o código já transforma para a data padrão 01/01/1970 e ele imprime 1 de janeiro de 1970.
    * */
    public String imprimirDataPorExtenso(){
        String mesConvertido = converterDataParaExtenso(mes);
        return this.dia + " de " + mesConvertido + " de " + this.ano;
    }
    public String converterDataParaExtenso(int mes){
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        return meses[mes - 1];

    }

    public int transformarDataEmDias(){
        return 1;
    }
    public int transformarDiasEmData(){
        return 1;
    }
    public boolean setDia(int dia) {
        if(!validarDias()){
            return false;
        }else{
            this.dia = dia;
            return true;
        }
    }

    public boolean setMes(int mes) {
        if(this.mes < 1 || this.mes > 12){
            return false;
        }else{
            this.mes = mes;
            return true;
        }
    }

    public boolean setAno(int ano) {
        if(this.ano < 0) {
            return false;
        }else{
            this.ano = ano;
            return true;
        }
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
