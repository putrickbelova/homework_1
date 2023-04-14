import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GoldenBank {

    public static void main(String[] args) {
        HashMap<Client, List<Account>> clientListHashMap = new HashMap<>();
        HashMap<Account,Client> accountClientHashMap = new HashMap<Account,Client>();

        Client client = new Client("Vasya", 20);
        Client client1 = new Client("Zina", 16);
        Client client2 = new Client("Petya", 22);

        Account account = new Account(1,100);
        Account account1 = new Account(2,50);
        Account account2 = new Account(3, 10);
        Account account3 = new Account(4,80);
        Account account4 = new Account(5,15);
        Account account5 = new Account(6,110);

        List<Account> accounts1 = new ArrayList<>();
        accounts1.add(0,account);
        accountClientHashMap.put(account,client);
        accounts1.add(1,account1);
        accountClientHashMap.put(account1,client);
        accounts1.add(2,account2);
        accountClientHashMap.put(account2,client);
        clientListHashMap.put(client, accounts1);


        List<Account> accounts2 = new ArrayList<>();
        accounts2.add(0,account3);
        accountClientHashMap.put(account3,client1);
        accounts2.add(1,account4);
        accountClientHashMap.put(account4,client1);
        clientListHashMap.put(client1, accounts2);


        List<Account> accounts3 = new ArrayList<>();
        accounts3.add(0,account5);
        accountClientHashMap.put(account5,client2);
        clientListHashMap.put(client2, accounts3);

       Scanner scanner = new Scanner(System.in);
        boolean continueFlag = true;

        do {
            System.out.println(" ");
            System.out.println("Что вы хотите ввести? 0-имя, 1-счет");
            int ent = scanner.nextInt();


            if (ent == 0) {
                String userAnswer;
                scanner.nextLine();
                System.out.println("Введите имя: ");

                userAnswer = scanner.nextLine();
                Client chosenClient = null;

                for (Client cli : clientListHashMap.keySet()) {
                    if (userAnswer.equals(cli.getName())) {
                        chosenClient = cli;
                    }
                }

                List<Account> accountList = clientListHashMap.get(chosenClient);
                System.out.println("Список счетов:");
                System.out.println(accountList);
                System.out.println(" ");
                System.out.println("Продолжаем? 0-нет, 1-да");
                int goDeeper = scanner.nextInt();
                if (goDeeper==0) {
                    continueFlag = false;
                } else {
                    System.out.println("Значит, да");
                }
            }

            else if (ent == 1) {
                System.out.println(" ");
                int userAnswer;
                //scanner.nextInt();
                boolean checkAnswer = true;
                Account chosenAccount = null;
                Client chosenClient = null;
                int checkCount = 0;
                while (checkAnswer) {
                    if (checkCount > 0) {
                        System.out.println("Такого счета нет");
                        System.out.println(" ");
                    }
                System.out.println("Введите номер счета: ");

                userAnswer = scanner.nextInt();

                    for (Account acc : accountClientHashMap.keySet()) {

                        if (userAnswer == acc.accountNum) {
                            chosenAccount = acc;
                            chosenClient = accountClientHashMap.get(acc);
                            checkAnswer = false;
                            break;
                        }
                    }
                    checkCount++;
                }

                System.out.println("Имя: " + chosenClient.name);
                System.out.println(" ");
                System.out.println("Продолжаем? 0-нет, 1-да");
                int goDeeper = scanner.nextInt();
                if (goDeeper==0) {
                    continueFlag = false;
                } else {
                    System.out.println("Значит, да");
                }
            }
            else {
                System.out.println("Ты что, дурак?");
            }

        } while (continueFlag);

    }

    private static class Account implements Comparable<Account> {
        int accountNum;

         public Account (int accountNum, int balanceSum) {
            this.accountNum = accountNum;
         }

        public int getAccountNum() {
            return accountNum;
        }

        @Override
        public String toString() {
            return "" + accountNum;
        }

        @Override
        public int compareTo(Account o) {
            return this.accountNum;
        }
    }

    private static class Client {
        String name;
        int age;


        public Client(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Client client = (Client) o;
            return age == client.age && Objects.equals(name, client.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return name;
        }

    }
}
