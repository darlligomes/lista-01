import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lado = leitor.nextInt();
        leitor.close();
        int area = lado * lado;
        System.out.println("A área é igual a " + area);
        area = area * 2;
        System.out.println("O dobro da área é igual a " + area);
    }
}
