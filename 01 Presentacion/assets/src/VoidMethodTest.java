public class VoidMethodTest{

    public static void main(String[] args){
        double doubleTest = Math.PI;
        printFormattedDouble(doubleTest);
    }

    public static void printFormattedDouble(double d1) {
        String strDouble = String.format("%.2f", d1);
        System.out.println(strDouble);
        d1 = 0; //no afecta a doubleTest
    }

    public static void doSomething(int p1, int p2, int p3){
        System.out.println(p1+p2+p3);
    }

    public static void printEvenChars(String s1){
        for(int i = 0; i<s1.length(); i++){
            if (i%2 == 0){
                System.out.print(s1.charAt(i));
            }
        }
        System.out.println();
    }

    public static int addOne(int num){
        return num + 1;
    }

    public static String concatenateTwoStrings(String s1, String s2){
        return s1 + s2;
    }

    public static boolean checkValidYear(int year) {
        if (year > 0 && year <= 9999 ){
            return true;
        }

        return false;
    }

    public static void printTenNumbers(int i){
        int j = i + 10;
        while(i<j){
            //never print bad luck numbers!
            if (i == 13)
                return;
            System.out.println(i++);
        }
    }



}