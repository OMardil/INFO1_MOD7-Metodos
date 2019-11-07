public class Problema2 {
    public static int operacion(int x) {
        return 2 * x;
    }

    public static void main(String[] args) {
        int var = 7;
        int result = 0;
        operacion(var);
        System.out.println("Resultado: " + result);
        result = operacion(var);
        System.out.println("Resultado " + result);
        result = operacion(result);
        System.out.println("Resultado " + result);


    }
}
