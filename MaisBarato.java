import java.util.Scanner;

public class MaisBarato {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Insira o valor de produto 1: ");
        int produto1 = Leitor.nextInt();
        System.out.println("Insira o valor de produto 2: ");
        int produto2 = Leitor.nextInt();
        System.out.println("Insira o valor de produto 3: ");
        int produto3 = Leitor.nextInt();
        int baratisse = Math.min(Math.min(produto1, produto2), produto3);
        if (baratisse == produto1){
            System.out.println("Produto 1 é o mais barato");
        } else if (baratisse == produto2){
            System.out.println("Produto 2 é mais barato");
        } else if(baratisse==produto3){
            System.out.println("Produto 3 é o mais barato");
        }
        
        // int quantidadeProdutos = 3;
        // int[] precos = new int[quantidadeProdutos];
        // for (int i = 0; i < quantidadeProdutos; i++) {
        //     precos[i] = Leitor.nextInt();
        // }
        // Leitor.close();
        // int maisBarato = precos[0];
        // for (int preco : precos) {
        //     if (preco < maisBarato) {
        //         maisBarato = preco;
        //     }
        // for (int i = 0; i < quantidadeProdutos; i++) {
        //     if (maisBarato == precos[i]) {
        //         System.out.println("Produto " + (i + 1) + " é o mais barato");
        //     }
    
        // }
    //   }
    // }   
    Leitor.close();
    }
}