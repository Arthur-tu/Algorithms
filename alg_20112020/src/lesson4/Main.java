package lesson4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Maria");
        mll.insertFirst("Katya");
        mll.insertFirst("Luba");

        MyQueue<String> mq = new MyQueue<>();
        mq.enqueue("qwe");
        mq.enqueue("asd");
        mq.enqueue("zxc");


       //  2. Добавить лист итератор в MyLinkedList

        for (int i = 0; i < 3; i++) {
            System.out.println(mq.dequeue());
        }
    }
}
