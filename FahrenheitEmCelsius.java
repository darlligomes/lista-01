import java.util.Scanner;
import java.text.DecimalFormat;


public class FahrenheitEmCelsius {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit: \n");
        double fahrenheit = leitor.nextDouble();

        double celsius = 5*((fahrenheit-32)/9);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        leitor.close();
        System.out.println("Temperatura em Celsius: " + df.format(celsius));

    }
}
