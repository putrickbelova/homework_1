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
                System.out.println(" ");
                for (TestAnswerVariant answer: answerVariant) {
                    answer.print();
                }
                System.out.println(" ");
                System.out.print("Ваш ответ: ");
            }

            public int isUserAnswerCorrect(int cock) {
            int result = 0;
                for (TestAnswerVariant answer: answerVariant) {
                    if (answer.variantNum==cock) {
                        if (answer.isAnswerCorrect) {
                            result = 1;
                        }
                    }
                }
                return result;
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
            int correctCount = 0, wrongCount = testQuestionsCount;


            for (TestQuestions questions:questionList) {
                // Вывод вопросов и вариантов
                questions.print();

                int userAnswer;

                while (true) {

                    userAnswer = scanner.nextInt();
                    boolean areYouHealthyUser = false;
                    for (int i = 0; i < questions.answerVariant.length; i++)
                        if (userAnswer == questions.answerVariant[i].variantNum) {
                            areYouHealthyUser = true;
                        }

                    if (areYouHealthyUser) {
                        break;
                    }
                    System.out.println("Вы ввели что-то странное");
                    System.out.print("Ваш ответ: ");
                }
                int checkAnswer = questions.isUserAnswerCorrect(userAnswer);
                if (checkAnswer == 1) {
                    System.out.println("Ответ верен");
                } else {
                    System.out.println("Ответ неверен");
                }
                System.out.println(" ");

                correctCount += questions.isUserAnswerCorrect(userAnswer);

            }

            wrongCount -=  correctCount;

            //Выводим общий результат
            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);

        }
    }