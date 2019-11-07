public class Problema5 {

    public static void main(String[] args) {
        checkString("ee");
        checkString("Wear access badge at all times");
        checkString("Billy Butch'r");
        checkString("Decentemente");
        checkString("Treebeard");
    }

    public static void checkString(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                num++;
        }
        if (num == 0) {
            System.out.println("Nothing");
            return;
        }
        if (1 <= num && num < 4) {
            System.out.println(num);
            return;
        }

        System.out.println("Too many!");
    }

}
