import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) {
        System.out.println("Insira três números");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.println("Segundo número: ");
        int n2 = leitor.nextInt();

        System.out.println("Terceiro número: ");
        int n3 = leitor.nextInt();
        leitor.close();

        int menor = Math.min(Math.min(n1, n2),n3);
        int maior = Math.max(Math.max(n1, n2),n3);

        int meio = 0;
        boolean Gemeos = false;
        if( maior != n1 && menor != n1 ){
            meio = n1;
           
        } else if( maior != n2 && menor != n2 ){
            meio = n2;
        } else if( maior != n3 && menor != n3 ){
            meio = n3;
        } else{
            System.out.println("Números semelhantes");
            Gemeos = true;
        }

        if( Gemeos == false ){
            System.out.println("1º " + maior + "\n" + "2º " + meio + "\n" + "3º " + menor);
        } 
    }
}
