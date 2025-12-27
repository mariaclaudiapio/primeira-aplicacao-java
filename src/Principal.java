public class Principal
{
    public static void main(String[] args)
    {
        System.out.println("************************************");
        System.out.println("**   Bem-vindo ao Screen Match!   **");
        System.out.println("************************************");

        String filme = "Harry Potter e a Pedra Filosofal";
        int ano = 2001;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String sinopse = "Primeiro filme da saga do bruxinho inglês.";

        System.out.printf("%nA nota do filme '%s', do ano de %d, é %.1f.%n", filme, ano, notaDoFilme);
    }
}
