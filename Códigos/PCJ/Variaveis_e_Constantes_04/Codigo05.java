package Variaveis_e_Constantes_04.Codigos;

import java.util.Scanner;

public class Codigo05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strig_inteiro, string_decimal;
        double numero_decimal;
        int numero_inteiro;

        System.out.print("Informe um número inteiro: ");
        numero_inteiro = scan.nextInt();

        System.out.print("Informe um número decimal: ");
        numero_decimal = scan.nextDouble();

        strig_inteiro = String.valueOf(numero_inteiro);
        string_decimal = String.valueOf(numero_decimal);

        System.out.println("\nConteúdo das strings: " +
                "\n string_inteiro = \t" + strig_inteiro +
                "\n string_decimal = \t" + string_decimal);
        System.out.println();
    }
}
