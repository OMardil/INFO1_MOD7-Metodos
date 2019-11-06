public class ImprimeObjeto {
    
    public void imprime(String str) {
        System.out.println("Valor entregado: " + str);
    }

    public static void main(String[] args) {
        String mensaje = "Solo es un objeto";
        ImprimeObjeto op = new ImprimeObjeto();
        System.out.println("Valor 1: " + mensaje);
        op.imprime(mensaje);
        System.out.println("Valor 2: " + mensaje);
    }
}
