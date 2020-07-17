
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int value1; String s1;
        int value2; String s2;
        String operand;

        while (true) {
            System.out.println("Введите пример(учитывайте пробелы до и после знака):");
            try{
                value1 = scanner.nextInt();
                operand = scanner.next();
                value2 = scanner.nextInt();
                Operations.doOperationA(value1, operand, value2);
            }
            catch (InputMismatchException e){
                s1 = scanner.next();
                operand = scanner.next();
                s2 = scanner.next();

                Operations.doOperationR(s1, operand, s2);
            }
        }
    }
}
