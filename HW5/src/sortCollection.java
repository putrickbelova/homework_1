import java.util.*;


public class sortCollection {


    private static int[] arraySort() {
        int[] mas = {4, 0, 6, -17, 9, 3, 8, -1, -7, 1, -5, 7, -3};
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
        list.add(4);
        list.add(0);
        list.add(6);
        list.add(-17);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(-1);
        list.add(-7);
        list.add(1);
        list.add(-5);
        list.add(7);
        list.add(-3);
        return list;
    }


    public static void main(String[] args) {
        int[] sortedArray = new int[15];
        long startTime1 = System.currentTimeMillis();
        sortedArray = arraySort();
        long endTime1 = System.currentTimeMillis();
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Time: " + (endTime1 - startTime1) + " milliseconds");

        List<Integer> list = createList();
        long startTime2 = System.currentTimeMillis();
        Collections.sort(list);
        long endTime2 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.print(item + " ");
        }
        System.out.println(" ");
        System.out.println("Time: " + (endTime2 - startTime2) + " milliseconds");
    }
}
