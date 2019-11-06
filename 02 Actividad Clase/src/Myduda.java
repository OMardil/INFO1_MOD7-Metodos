public class Myduda {
    public int x = 3, y = 5;

    public void muestra() {
        System.out.println("x = " + x + "; y = " + y);
    }

    //
    public static void main(String[] args) {
        Myduda pt = new Myduda();
        pt.muestra();
        pt.x = 45;
        pt.y = 83;
        pt.muestra();
    } //
} //
