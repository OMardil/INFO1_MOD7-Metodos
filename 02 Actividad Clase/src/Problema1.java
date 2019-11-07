public class Problema1 {
    public static void imprimir(int x) {
        System.out.println("Primer valor : " + x);
        x = 100;
        System.out.println("Segundo valor: " + x);
    }

    public static void main(String[] args) {
        int var = 7;
        System.out.println("Primer valor: " + var);
        imprimir(var);
        System.out.println("Segundo valor " + var);
    }
}
