public class Problema4 {

    public static void main(String[] args) {
        boolean b1 = between(4, 10);
        b1 = between(14, 0);
        System.out.println(b1);

        b1 = between(0, 17);
        System.out.println(b1);        
        
        b1 = between(-10, 25);
        System.out.println(b1);

        int i = (int)(Math.ceil(9.9));
        b1 = between(i, i);
        System.out.println(b1);        

        b1 = between(560, (int) (129 / 13.0));
        System.out.println(b1);
    }

    public static boolean between(int a, int b) {
        return (10 <= a && a <= 20) || (10 <= b && b <= 20);
    }
}
