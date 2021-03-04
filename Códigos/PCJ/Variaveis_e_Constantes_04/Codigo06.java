package Variaveis_e_Constantes_04.Codigos;

import java.util.Scanner;

public class Codigo06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nInforme um caractere: ");
        String texto = scan.nextLine();
        char caractere = texto.charAt(0);
        int codigo = (int) caractere;

        System.out.println("Código do Caractere: \t" + codigo);
        System.out.println();
    }
}
