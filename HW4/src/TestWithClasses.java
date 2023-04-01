import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestWithClasses {



    public static class TestQuestions {
        int questionNum;
        String questionText;
        TestAnswerVariant[] answerVariant;

        public TestQuestions(int questionNum, String questionText, TestAnswerVariant[] answerVariant) {
            this.questionNum = questionNum;
            this.questionText = questionText;
            this.answerVariant =  answerVariant;
        }


        @Override
        public String toString() {
            return questionNum + " вопрос: " + questionText;
        }

            public void print() {
                System.out.println(questionNum + " вопрос: " + questionText);
            }



    }

    public static class TestAnswerVariant {
        // класс ответов, связанных с вопросами
        int variantNum;
        String variantText;
        Boolean isAnswerCorrect;


        public TestAnswerVariant(int variantNum, String variantText, Boolean isAnswerCorrect) {
            this.variantNum = variantNum;
            this.variantText = variantText;
            this.isAnswerCorrect = isAnswerCorrect;
        }


        //
        public void print() {
            System.out.println(variantNum + ") " + variantText);
        }

        // Получение String  для Map из ответа пользователя
        /*public String answerChoosing(int userAnswer) {
            var counter = 1;
            String userAnswerString = "error";
            for (String k : dictionary.keySet()) {
                if (counter != userAnswer) {
                    counter++;
                } else {userAnswerString = k;}
            }

            return userAnswerString;
        }




        //int правильный/неправильный(номерВариантаПолученныйОтПользователя)
        public int isAnswerCorrect(String userAnswerString) {
            int result = 0;
            for (String k : dictionary.keySet()) {
                if (k == userAnswerString) {
                    if (dictionary.get(userAnswerString)) {result = 1;}
                }
            }
            return result;
        }*/

    }



        public static void main(String[] args) {

            //Кол-во вопросов в тесте
            int testQuestionsCount = 3;

            //Массивы экземпляров классов
            TestQuestions[] questionList = new TestQuestions[testQuestionsCount];


            //Инициализация
            TestAnswerVariant[] answersList1 = new TestAnswerVariant[4];
            answersList1[0] = new TestAnswerVariant(1,"1", false);
            answersList1[1] = new TestAnswerVariant(2,"8", false);
            answersList1[2] = new TestAnswerVariant(3,"3", false);
            answersList1[3] = new TestAnswerVariant(4,"4", true);
            questionList[0] = new TestQuestions(1, "Сколько будет 2 + 2?",answersList1);

            TestAnswerVariant[] answersList2 = new TestAnswerVariant[3];
            answersList2[0] = new TestAnswerVariant(1,"да, она для красоты", false);
            answersList2[1] = new TestAnswerVariant(2,"да, если ее произвели перед циклом",true);
            answersList2[2] = new TestAnswerVariant(3,"нет, она обязательна и может производиться только в объявлении цикла", false);
            questionList[1] = new TestQuestions(2, "Можно ли пропустить инициализацию в цикле for?", answersList2);

            TestAnswerVariant[] answersList3 = new TestAnswerVariant[4];
            answersList3[0] = new TestAnswerVariant(1,"циклический", false);
            answersList3[1] = new TestAnswerVariant(2,"оптический",true);
            answersList3[2] = new TestAnswerVariant(3,"линейный", false);
            answersList3[3] = new TestAnswerVariant(4,"разветвляющийся", false);
            questionList[2] = new TestQuestions(3, "Какого алгоритма не существует?", answersList3);

            Scanner scanner = new Scanner(System.in);

            // Переменные для хранения количества правильных и неправильных ответов
            int correctCount = 0, wrongCount = 0;


            for (TestQuestions questions:questionList) {
                // Вывод вопросов и вариантов
                questions.print();
                System.out.println(" ");


                /*answersList[questions.questionNum-1].print();
                System.out.println(" ");
                System.out.print("Ваш ответ: ");

                // Считываем с консоли ответ пользователя
                int userAnswer = scanner.nextInt();
                userAnswer--;
                String userAnswerString = answersList[questions.questionNum-1].answerChoosing(userAnswer);
                System.out.println(answersList[questions.questionNum-1].answerChoosing(userAnswer));
                System.out.println(userAnswer);
                System.out.println(userAnswerString);
                correctCount = correctCount + answersList[questions.questionNum-1].isAnswerCorrect(userAnswerString);
                System.out.println(" ");*/
            }

            wrongCount = testQuestionsCount - correctCount;

            //Выводим общий результат
            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);

        }
    }