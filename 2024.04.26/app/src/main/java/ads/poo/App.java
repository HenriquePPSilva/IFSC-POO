package ads.poo;

public class App {

    public static void main(String[] args) {
        Telefone phone = new Telefone("48998545906", "Pessoal");
        System.out.println(phone);

        Email email = new Email("example@gmail.com", "Corporativo");
        System.out.println(email);
    }
}
