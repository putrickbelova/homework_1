/*import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork2 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
       /* int correctCount = 0, wrongCount = 0;

        // Массив один и общий
        // Нулевой элемент - вопрос, остальные ответы (первый символ ответа - признак его правильности)
        String[][] answerOptions = {{"Сколько будет 2 + 2?", "01", "08", "03", "14"},
                {"Можно ли пропустить инициализацию в цикле for?", "0да, она для красоты", "1да, если ее произвели перед циклом", "0нет, она обязательна и может производиться только в объявлении цикла"},
                {"Какого алгоритма не существует?", "0циклический", "1оптический", "0линейный", "0разветвляющийся"}};


        Scanner scanner = new Scanner(System.in);
        // Счетчик для красивого вывода
        int questionCount = 1;

        //  Цикл по всем вопросам
        for (int i = 0; i < answerOptions.length; i++) {

            // Вывод вопроса на экран
            System.out.println(" ");

            System.out.println(questionCount + " вопрос: " + answerOptions[i][0]);

            System.out.println(" ");

            // Счетчик для красивого вывода вариантов ответа
            int answerCount = 1;
            // Переменная для записи номера правильного ответа
            int correctAnswer = -1;

            for (int j = 1; j < answerOptions[i].length; j++) {


                // Вывод вариантов ответов на экран
                System.out.println(answerCount + ") " + answerOptions[i][j].substring(1));
                // В первом символе записан признак правильный(1)/неправильный(0)
                if (answerOptions[i][j].charAt(0) == '1') {
                    correctAnswer = answerCount;
                }
                answerCount++;

            }

            questionCount++;
            System.out.println(" ");
            System.out.print("Ваш ответ: ");
            // Считываем с консоли ответ пользователя
            int answer = scanner.nextInt();

            if (answer == correctAnswer) {
                correctCount++;
                System.out.println("Ответ верен");
            } else {
                wrongCount++;
                System.out.println("Ответ неверен");
            }
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }*/
   /*     String text = "One   two three";
        System.out.println(text);

        String[] split = text.split(" ");
     /*   for(int i=0; i< split.length;i++) {
            System.out.println(split[i]);
        }*/
       /* --System.out.println(split.length);
        String finalText = split[(split.length-1)];

        for(int i= (split.length - 2); i>-1; i--) {
            finalText = finalText + " " + split[i];
        }
        System.out.println(finalText);
/*
        Pattern pattern = Pattern.compile(" +");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }*/
/*
        String input = "{{}}";

        Pattern pattern1 = Pattern.compile("\\{");
        Matcher matcher1 = pattern1.matcher(input);

        while (matcher1.find()) {
            System.out.println(input.substring(matcher1.start(), matcher1.end()));
        }


        Pattern pattern2 = Pattern.compile("\\}");
        Matcher matcher2 = pattern2.matcher(input);
        String[] brackets = new String[input.length()];
        String bracket;

        int i = 0;
        while (matcher2.find()) {
           bracket = (input.substring(matcher2.start(), matcher2.end()));
            brackets[i] = bracket;
           i++;
        }
        Integer.to


    }
}*/
/*
public class FunctionUtilsShiftZeroes {
    public static int shiftZeroes(int input) {
       // String[ ] x = '';
        String binary = Integer.toBinaryString(input);
      /*  for (int i=0;i<binary.length();i++) {
            x = x || '1';
        }*/

      /*  int sum = 0;
        for (int i=0;i<binary.length();i++) {
            sum += Math.pow(2,i);
        }
Integer.toHexString()

        return sum;
    }
    private FunctionUtilsShiftZeroes() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 3435, метод должен вернуть 4095 - '"
                        + FunctionUtilsShiftZeroes.shiftZeroes(3435)
                        + "'"
        );
    }
}*/

public class MathUtilFactorial {
    public static long getFactorial(byte number) {
        long result = 1L;
        if (number > 0) {

            for (int i=1; i<=number;i++) {
                result = Math.multiplyExact(result,i);
            }
        } else {result = 0;}
        return result;
    }

    private MathUtilFactorial() {

    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + MathUtilFactorial.getFactorial((byte) 5));
    }
}