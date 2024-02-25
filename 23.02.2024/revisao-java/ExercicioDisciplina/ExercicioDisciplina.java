
public class ExercicioDisciplina {
    public static void main(String[] args) {
        double cf = 0.0; 
        
        if(args.length >= 3){
            double nota1 = Double.parseDouble(args[0]);
            double nota2 = Double.parseDouble(args[1]);
            double nota3 = Double.parseDouble(args[2]);
            cf = (((nota1 * 2 + (nota2 * 3)) / (2 + 3)) * 0.9 + nota3 * 0.1);
            //Estou arredondando o valor com o Math.round(), pois fica feio 6,933333334.
            System.out.println("A média do aluno foi de: " + Math.round(cf));
            if(cf >= 6){
                System.out.println("Parabéns, sua média foi suficiente para passar!");
            }else{
                System.out.println("Infelizmente você foi reprovado!");
            }
        }else{
            System.out.println("Informe pelomenos 3 argumentos de linha de comando.");
        }
    }
}
