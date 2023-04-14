import java.util.*;


public class sortCollection {


    private static int[] arraySort() {
        int[] mas = new int[100000];
        for (int i = 0; i < 100000; i++) {
            mas[i] = (int) (Math.random()*(600+1)) - 200;
            System.out.println(mas[i]);
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;

                }
            }
        }
        return mas;
    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int x;
        while (i<100000) {
            x = (int) (Math.random()*(600+1)) - 200;
            list.add(x);
            i++;
        }
        return list;
    }


    public static void main(String[] args) {
        int[] sortedArray = new int[100000];
        long startTime1 = System.currentTimeMillis();
        sortedArray = arraySort();
        long endTime1 = System.currentTimeMillis();
        /*for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }*/
        System.out.println(" ");
        System.out.println("sortedArray. Time: " + (endTime1 - startTime1) + " milliseconds");

        List<Integer> list = createList();
        long startTime2 = System.currentTimeMillis();
        Collections.sort(list);
        long endTime2 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        /*while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.print(item + " ");
        }*/
        System.out.println(" ");
        System.out.println("Collections.sort. Time: " + (endTime2 - startTime2) + " milliseconds");
    }
}
