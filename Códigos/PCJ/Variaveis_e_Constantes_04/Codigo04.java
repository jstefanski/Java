package Variaveis_e_Constantes_04.Codigos;

import java.util.Scanner;

public class Codigo04 {
    public static void main(String[] args) {
        System.out.print("Informe um número: "); //Ex. 65

        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();

        double db = Double.parseDouble(texto);
        float fl = Float.parseFloat(texto);
        long lg = Long.parseLong(texto);
        int it = Integer.parseInt(texto);
        short sh = Short.parseShort(texto);
        byte bt = Byte.parseByte(texto);
        char ch = (char) Integer.parseInt(texto);

        System.out.printf("\nConteúdo das Variáveis" +
                "\n db = \t %f \n fl = \t %f \n lg = \t %d \n it = \t %d" +
                "\n sh = \t %d \n bt = \t %d \n ch = \t %c \n\n",
                db, fl, lg, it, sh, bt, ch);
    }
}
