import java.util.Scanner;

public class Codigo07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nInforme um número inteiro: ");
        String texto = scan.nextLine();
        int numero = Integer.parseInt(texto);
        char caractere = (char) numero;

        System.out.println("Caractere Correspondente: \t" + caractere);
        System.out.println();
    }
}