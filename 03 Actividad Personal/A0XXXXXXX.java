public class A0XXXXXXX {

    public static void testProblem1(int problem, int test, int param1, int param2, boolean correctResult) {
        System.out.print("P" + problem + "T" + test + "-->");
        if (!compareLastDigit(param1, param2) == correctResult) {
            System.out.println("Error: " + param1 + " " + param2 + " should not return " + correctResult);
        } else {
            System.out.println("Correct!");
        }
    }

    public static void testProblem2(int problem, int test, String param1, String correctResult) {
        System.out.print("P" + problem + "T" + test + "-->");
        String result1 = frontBack(param1);
        if (!result1.equals(correctResult)) {
            System.out.println(
                    "Error: " + result1 + " " + correctResult + " are not first/last swapped: " + param1);
        } else {
            System.out.println("Correct!");
        }
    }

    public static void main(String[] args) {

        // PROBLEM 1
        testProblem1(1, 1, 7, 17, true);
        testProblem1(1, 2, 1, 0, false);
        testProblem1(1, 3, 1, 111, true);
        testProblem1(1, 4, 3, 133, true);

        // PROBLEM 2
        testProblem2(2, 1, "hola", "aolh");
        testProblem2(2, 2, "", "");
        testProblem2(2, 3, " 1 ", "1");
        testProblem2(2, 4, "asd", "dsa");
        testProblem2(2, 5, "helloworld", "delloworlh");

        // PROBLEM 3

    }

    public static boolean compareLastDigit(int i1, int i2) {
        int mod1 = i1 % 10;
        int mod2 = i2 % 10;

        if (mod1 == mod2) {
            return true;
        } else {
            return false;
        }
    }

    public static String frontBack(String s1) {

        s1 = s1.trim();

        if (s1.length() == 0) {
            return "";
        }

        if (s1.length() == 1) {
            return s1;
        }

        String front = s1.substring(0, 1); // first character
        String mid = s1.substring(1, s1.length() - 1); // if length 2, returns empty string
        String back = s1.substring(s1.length() - 1, s1.length()); // last character

        return back + mid + front;

    }

}