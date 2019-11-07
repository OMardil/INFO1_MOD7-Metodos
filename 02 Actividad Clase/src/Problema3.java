public class Problema3 {
    public static int diff(int n) {
        if (n <= 21)
            return 21 - n;

        return 2 * (n - 21);
    }

    public static void main(String[] args) {
        int a = diff(10);
        System.out.println(a);
        
        a = diff(a);
        System.out.println(a);

        a = diff(++a + 15);
        System.out.println(a);        
        
        a = 23;
        System.out.println(diff(a));
    }
}
