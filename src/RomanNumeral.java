public class RomanNumeral extends Calculator{
        private final int num;
        private static int[]    numbers = {100,   90,
                50,   40,   10,    9,    5,    4,    1 }; // массивы с символами
        private static String[] letters = { "C",  "XC",
                "L",  "XL",  "X",  "IX", "V",  "IV", "I" };

        public RomanNumeral(String roman) { // Конструктор принимающий в параметры римское число
            int i = 0;
            int arabic = 0;
            while (i < roman.length()) {

                char letter = roman.charAt(i);
                int number = letterToNumber(letter);

                if (number < 0)
                    throw new NumberFormatException("Введите либо римские числа либо арабские");
                i++;

                if (i == roman.length()) {
                    arabic += number;
                }
                else {

                    int nextNumber = letterToNumber(roman.charAt(i));
                    if (nextNumber > number) {

                        arabic += (nextNumber - number);
                        i++;
                    }
                    else {
                        arabic += number;
                    }
                }

            }


            if (arabic > 10 || arabic <1)
                throw new NumberFormatException("Числа только от I до X");

            num = arabic;

        }
        public RomanNumeral(int sum){
            this.num = sum;                 // конструктор для переменной решения уравнения
        }
        private int letterToNumber(char letter) {
            switch (letter) {
                case 'I':  return 1;
                case 'V':  return 5;
                case 'X':  return 10;
                case 'L':  return 50;
                case 'C':  return 100;
                default:   return -1;
            }
        }
        public String toString() {
            String roman = "";
            int N = num;
            for (int i = 0; i < numbers.length; i++) {  // метод преобразовывающий
                while (N >= numbers[i]) {               // решение в число
                    roman += letters[i];
                    N -= numbers[i];
                }
            }
            return roman;
        }
        public int toInt(){
            return num;                     // метод возвращающий арабское значение римского числа

        }
}
