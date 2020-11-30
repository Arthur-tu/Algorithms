package lesson2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(1000_000);
        for (int i = 0; i < 10000; i++) mal.add(random.nextInt(1000));
        System.out.println(mal);
        /*
        //Сортировка выбором
        long start = System.currentTimeMillis();
        mal.selectionSort();
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
        */

        /*
        //Сортировка пузырьком
        long start = System.currentTimeMillis();
        mal.bubbleSort();
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
        */

        //Сортировка вставкой
        long start = System.currentTimeMillis();
        mal.insertionSort();
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
        System.out.println(mal);
    }
}
