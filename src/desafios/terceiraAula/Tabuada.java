/* Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de
1 a 10 */

package desafios.terceiraAula;

import java.util.Scanner;

public class Tabuada
{
    public static void main(String[] args)
    {
        System.out.println("Informe um número inteiro:");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        System.out.printf("Tabuada de adição do número %d:\n", numero);
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        scanner.close();
    }
}
