

package desafios.terceiraAula;

import java.util.Scanner;

public class Numeros
{
    public static void main(String[] args)
    {
        /* Crie um programa que solicite um número ao usuário.
        Se o número for positivo, exiba 'Número positivo'. Caso contrário, exiba 'Número negativo' */
        System.out.println("Digite um número:");

        Scanner numero = new Scanner(System.in);
        int numeroDigitado = numero.nextInt();

        if (numeroDigitado < 0)
        {
            System.out.println("Número negativo.");
        }
        else
        {
            System.out.println("Número positivo.");
        }

        /* Peça ao usuário para inserir dois números inteiros. Compara os números e imprima uma
        * mensagem indicando se são iguais, diferentes e qual dos dois é o maior */
        System.out.println("*******************************");
        System.out.println("**   Comparador de números   **");
        System.out.println("*******************************");
        System.out.println("Digite um número inteiro");
        int primeiroNumero = numero.nextInt();

        System.out.println("Digite outro número inteiro");
        int segundoNumero = numero.nextInt();

        if (primeiroNumero == segundoNumero)
        {
            System.out.println("Os números são iguais.");
        }
        else if (primeiroNumero < segundoNumero)
        {
            System.out.println("Os números são diferentes. O primeiro número é menor do que o segundo.");
        }
        else
        {
            System.out.println("Os números são diferentes. O primeiro número é maior do que o segundo.");
        }

        numero.close();
    }
}
