public class Codigo01 {
    public static void main(String[] args) {
        byte bt;
        short sh;
        int it;
        long lg;

        bt = 127;
        sh = 32767;
        it = 2147483647;
        lg = 9223372036854775807L;

        System.out.println("\nLimite Superior: ");
        System.out.println("byte:\t" + bt);
        System.out.println("short:\t" + sh);
        System.out.println("int:\t" + it);
        System.out.println("long:\t" + lg);

        bt = -128;
        sh = -32768;
        it = -2147483648;
        lg = -9223372036854775808L;

        System.out.println("\nLimite Inferior: ");
        System.out.println("byte:\t" + bt);
        System.out.println("short:\t" + sh);
        System.out.println("int:\t" + it);
        System.out.println("long:\t" + lg);
    }
}
