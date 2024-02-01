import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double raio = leitor.nextDouble();
        double area = (3.14*(raio*raio));
        leitor.close();
        System.out.println("Área igual a = " + area);

    }
}
