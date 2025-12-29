/* Crie um menu que oferece duas opções ao usuário:
* 1. Calcular área do quadrado
* 2. Calcular área do círculo
* Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */
package desafios.terceiraAula;

import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        System.out.println("Escolha uma das opções: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        Scanner opcao = new Scanner(System.in);
        int opcaoEscolhida = opcao.nextInt();

        if (opcaoEscolhida == 1)
        {
            System.out.println("Digite o valor do lado do quadrado:");
            int ladoQuadrado = opcao.nextInt();
            int areaQuadrado = (ladoQuadrado * ladoQuadrado);
            System.out.printf("A área do quadrado é de %dm².\n", areaQuadrado);
        }
        else if (opcaoEscolhida == 2)
        {
            System.out.println("Digite o valor do raio do círculo:");
            int raio = opcao.nextInt();
            final double PI = 3.14;
            double areaCirculo = (PI * raio * raio);
            System.out.printf("A área do círculo é de %.2fm².\n", areaCirculo);
        }
        else
        {
            System.out.println("Opção inválida.");
        }

        opcao.close();
    }
}
