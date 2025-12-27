package desafios.segundaAula;

public class Media
{
    public static void main(String[] args)
    {
        // Crie um programa que realize a média de duas notas decimais e exiba o resultado
        double primeiraNota = 8;
        double segundaNota = 10;
        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("A média das notas é: " + media);

        /* Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável
           para int e exiba o resultaado */
        double pontoDecimal = 4.5;
        int inteiro = (int) pontoDecimal;

        System.out.printf("O valor truncado é %d.", inteiro);

        /* Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra)
           Atribua valores a essas variáveis e concatene-as em uma mensagem */
        char sexo = 'F';
        String nome = "Maria";

        System.out.printf("%nMeu nome é %s e sou do sexo %c.", nome, sexo);

        /* Declare uma variável do tipo double e uma variável do tipo int. Calcule o valor total
           multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem */
        double precoProduto = 7990.00;
        int quantidade = 2;
        double valorTotal = precoProduto * quantidade;

        System.out.printf("%nO preço total é: R$%.2f.", valorTotal);

        /* Declare uma variável do tipo double. Atribua um valor em dólares a essa variável. Considere
        *   que o valor de 1 dólar equivale a 5,54 reais. Realize a conversão do valor em dólares e
        *  imprima o resultado formatado. */
        double valorEmDolares = 1799;
        double valorEmReais = valorEmDolares * 5.55;

        System.out.printf("%nO valor em reais é R$%.2f.", valorEmReais);

        /* Declare uma variável do tipo double. Atribua um valor em reais a essa variável, presentando
        * o preço original de um produto. Em seguida, declare uma variável do tipo double e atribua
        * um valor percentual de desconto ao produto. */
        double precoOriginal = 7990;
        double percentualDesconto = 0.10;
        double precoComDesconto = precoOriginal - (precoOriginal * percentualDesconto);

        System.out.printf("%nO valor com desconto é R$%.2f.", precoComDesconto);
    }
}
