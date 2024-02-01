import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int n1 = Leitor.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = Leitor.nextInt();
        System.out.println("Insira o terceiro número: ");
        int n3 = Leitor.nextInt();
        Leitor.close();
        if(n1 == n2 && n2 == n3){
            System.out.println("Os três números são iguais!");
        } else {
            int maior = Math.max(Math.max(n1, n2), n3);
            System.out.println("O maior é: " + maior);
            int menor = Math.min(Math.min(n1, n2), n3);
            System.out.println("O menor é: " + menor);
        }  
    }
}
