// Escreva um programa que converta temperaturas de graus Celsius para Fahrenheit

package desafios.segundaAula;

public class Conversor
{
    public static void main(String[] args)
    {
        System.out.println("***********************************************************");
        System.out.println("**  Conversor de Temperaturas - Celsius para Fahrenheit  **");
        System.out.println("***********************************************************");

        int celsius = 30;
        double celsiusParaFarenheit = (celsius * 1.8) + 32;
        int fahrenheit = (int) celsiusParaFarenheit;

        System.out.printf("%dºC equivalem a %dºF.", celsius, fahrenheit);
    }
}
