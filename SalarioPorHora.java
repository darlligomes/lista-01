import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioPorHora
{
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Quanto você recebe por hora?\n");
        double PorHora = Leitor.nextDouble();
        System.out.println("Quanto você trabalhou nesse mês, em horas?\n");
        int Horas = Leitor.nextInt();
        Leitor.close();

        double ValorDoMes = Horas * PorHora;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);

        System.out.println("Total do mês: " + df.format(ValorDoMes));
    }
}
