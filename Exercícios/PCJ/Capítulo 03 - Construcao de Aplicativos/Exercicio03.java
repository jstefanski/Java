/*
 * Crie um novo aplicativo, chamado Exercicio3, que solicite o nome e o e-mail ao seu usuário e que, ao final, apresente
 * estes dois dados como se fosse uma confirmação de cadastro. As saídas produzidas por este aplicativo devem se
 * idênticas àquelas apresentadas na figura 3.15. Além disso, você deve implementar este aplicativo sem utilizar a
 * classe java.util.Scanner. Ao invés desta classe, o aplicativo deve captar a entrada de dados através do outro
 * procedimento apresentado neste capítulo.
 */

import java.io.IOException;

public class Exercicio03 {
    public static void main(String[] args) throws IOException {

        System.out.print("Informe seu Nome: \t\t");
        byte[] bt_nome = new byte[50];
        System.in.read(bt_nome);
        String nome = new String(bt_nome).trim();

        System.out.print("Informe seu E-mail: \t");
        byte[] bt_email = new byte[50];
        System.in.read(bt_email);
        String email = new String(bt_email).trim();

        System.out.println();

        System.out.println("Cadastro Confirmado!");
        System.out.printf("Nome: \t\t %s \nE-mail: \t %s \n", nome, email);
    }
}
