/*
 * Crie um novo aplicativo chamado Exercicio2, que apresente a tabuada do número 9 utilizando uma disposição idêntica à
 * da Figura 3.14 para organizar todos os dados. Note que estes dados estão divididos em dois grandes blocos e que
 * algumas colunas de números estão alinhadas à direita.
 */

public class Exercicio02 {
    public static void main(String[] args) {
        int tabuada = 9;

        System.out.println();
        System.out.printf(tabuada  + " x 1 =  %1d"           + "\t\t" + tabuada + " x %2d = " + tabuada * 6 + "\n", tabuada, 6);
        System.out.printf(tabuada  + " x 2 = " + tabuada * 2 + "\t\t" + tabuada + " x %2d = " + tabuada * 7 + "\n", 7);
        System.out.printf(tabuada  + " x 3 = " + tabuada * 3 + "\t\t" + tabuada + " x %2d = " + tabuada * 8 + "\n", 8);
        System.out.printf(tabuada  + " x 4 = " + tabuada * 4 + "\t\t" + tabuada + " x %2d = " + tabuada * 9 + "\n", 9);
        System.out.println(tabuada + " x 5 = " + tabuada * 5 + "\t\t" + tabuada + " x 10 = "  + tabuada * 10);
    }
}