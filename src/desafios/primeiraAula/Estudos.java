// Crie uma classe chamada "Estudos" para imprimir anotações de estudos no console

package desafios.primeiraAula;

import java.util.Scanner;

public class Estudos
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas anotações abaixo: ");
        String anotacoes = scanner.nextLine();

        System.out.println("\n**   Minhas anotações de aula   **");
        System.out.println(anotacoes);

        scanner.close();
    }
}
