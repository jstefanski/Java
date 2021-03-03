package Construcao_de_Aplicativos_03.Codigos;

import java.util.Scanner;

public class Codigo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nInforme seu Nome:\t");
        String nome = scan.nextLine();

        System.out.print("Informe seu E-mail:\t");
        String email = scan.nextLine();

        System.out.println();
        System.out.println("Dados Recebidos");
        System.out.printf("Nome:\t %s \nE-mail:\t %s\n\n", nome, email);
        System.out.println();
    }
}
