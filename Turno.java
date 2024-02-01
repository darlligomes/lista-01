import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Map<String, String> saudacao = new HashMap<>();
        saudacao.put("M", "Bom Dia!");
        saudacao.put("V", "Boa Tarde!");
        saudacao.put("N", "Boa Noite!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Em que turno você estuda? (M para matutino, V-vespertino, N-noturno)");
        String turno = scanner.next().toUpperCase();
        scanner.close();
        String saudacaoAgora = saudacao.containsKey(turno) ? saudacao.get(turno) : "Valor Inválido!";

        System.out.println(saudacaoAgora);
        
    }
}
