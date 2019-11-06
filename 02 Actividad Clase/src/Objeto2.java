public class Objeto2 {
    public void muestra(String st) {
        System.out.println("Valor del parametro: " + st);
        st = "Hey este es un objeto!";
        System.out.println("Valor del parametro: " + st);
    }

    public static void main(String[] args) {
        String mensaje = "Original Object";
        Objeto2 op = new Objeto2();
        System.out.println("Contenido: " + mensaje);
        op.muestra(mensaje);
        System.out.println("Contenido: " + mensaje);
    }//
} //
