//OlaMundo.java

//CamelCase

//pascalCase

//snake_case

//kebab-case

/**
 * OlaMundo
 */

public class OlaMundo {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Digite um argumento!");
            return;
        }
        
        switch(args[0]){
            case "en":
                System.out.println("Hello Word!");
            break;

            case "pt":
                System.out.println("Olá Mundo");
            break;

            case "jp":
                System.out.println("\u3053\u3093\u306B\u3061\u306F\u4E16\u754C");
            break;

            default:
                System.out.println("Linguagem não encontrada");


        }
    }
}