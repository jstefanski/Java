package Variaveis_e_Constantes_04.Codigos;

import java.util.Scanner;
import java.text.NumberFormat;

public class Codigo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("\nInforme um valor de Faturamento: \t");
        double faturamento = scan.nextDouble();

        double valor_cofins = faturamento * Codigo08.COFINS / 100; // Codigo08 contém as constantes declaradas
        double valor_pis = faturamento * Codigo08.PIS / 100;
        double total_impostos = valor_cofins + valor_pis;

        System.out.println("COFINS (3%): \t" + nf.format(valor_cofins));
        System.out.println("PIS (0,65%): \t" + nf.format(valor_pis));
        System.out.println("TOTAL: \t\t" + nf.format(total_impostos));
        System.out.println();
    }
}
