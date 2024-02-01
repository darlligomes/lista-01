import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusEmFahrenheit {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius");
        double celsius = leitor.nextDouble();
        leitor.close();
        double fahrenheit = (celsius * 1.8) + 32;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        System.out.println("Temperatura em Fahrenheit: " + df.format(fahrenheit));
    }
}
