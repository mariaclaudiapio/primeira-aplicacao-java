/* Implemente uma aplicação java que apresente as seguintes operações:
* 1 - Consultar saldos;
* 2 - Receber valor;
* 3 - Transferir valor;
* 4 - Sair */

package desafios.quartaAula;

import java.util.Scanner;

public class contaCorrente
{
    public static void main(String[] args)
    {
        System.out.println("*************************************");
        System.out.println("**   Bem vindo ao banco da Marie   **");
        System.out.println("*************************************");

        double saldo = 1000;

        System.out.println("""
                * Digite '1' para consultar saldos;
                * Digite '2' para depósitos;
                * Digite '3' para saques;
                * Digite '4' para sair;
                """);

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.printf("Você escolheu a opção %d. ", opcao);

        if (opcao == 1)
        {
            System.out.printf("Seu saldo é R$%.2f\n", saldo);
        }
        else if (opcao == 2)
        {
            System.out.printf("Qual valor você deseja depositar?\n");
            double deposito = scanner.nextDouble();

            saldo += deposito;
            System.out.printf("Seu saldo agora é de R$%.2f.\n", saldo);
        }
        else if (opcao == 3)
        {
            System.out.println("Qual valor você deseja sacar?\n");
            double saque = scanner.nextDouble();

            if (saque >= 0 && saque <= saldo)
            {
                saldo -= saque;
                System.out.printf("Seu saldo agora é de R$%.2f.\n", saldo);
            }
            else
            {
                System.out.printf("Valor inválido. Por favor, digite um valor compreendido entre 0 e %.2f.\n", saldo);
            }
        }
        else if (opcao == 4)
        {
            System.out.println("Saindo do programa...");
        }
        else
        {
            System.out.println("Ela é inválida. Por favor, escolha um dos números acima.");
        }

        scanner.close();
    }
}
