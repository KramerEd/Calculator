public class Operations{

    public static void doOperationA(int value1, String operand, int value2 ) throws Exception {
         if ((value1 < 1 || value1 > 10) || (value2 < 1 || value2 > 10)) {
             throw new Exception("Числа должны быть от 1 до 10 включительно.");
         }
         if (!(operand.equals("+")) && !(operand.equals("-")) &&
                 !(operand.equals("*")) && !(operand.equals("/"))) {
             throw new Exception("Введите правильную операцию."); }

         switch (operand) {
             case "+":
                 System.out.println(value1 + value2);
                 break;
             case "-":
                 System.out.println(value1 - value2);
                 break;
             case "*":
                 System.out.println(value1 * value2);
                 break;
             case "/":
                 System.out.println(value1 / value2);
                 break;
         }
    }


    public static void doOperationR(String s1,String operand, String s2) throws Exception{
        RomanNumeral rN1 = new RomanNumeral(s1);
        RomanNumeral rN2 = new RomanNumeral(s2);
        int value1 = rN1.toInt();
        int value2 = rN2.toInt();
        int sol;
        if (!(operand.equals("+")) && !(operand.equals("-")) &&
                !(operand.equals("*")) && !(operand.equals("/"))) {
            throw new Exception("Введите правильную операцию."); }

        switch (operand) {
            case "+":
                sol = value1 + value2;
                RomanNumeral r1 = new RomanNumeral(sol);
                System.out.println(r1.toString());
                 break;
            case "-":
                sol = value1 - value2;
                RomanNumeral r2 = new RomanNumeral(sol);
                System.out.println(r2.toString());
                 break;
            case "*":
                sol = value1 * value2;
                RomanNumeral r3 = new RomanNumeral(sol);
                System.out.println(r3.toString());
                break;
            case "/":
                sol = value1 / value2;
                RomanNumeral r4 = new RomanNumeral(sol);
                System.out.println(r4.toString());
                System.out.println(value1 / value2);
                break;
        }
    }
}


