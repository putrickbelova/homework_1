import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

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
    }
}