package lesson5;

public class Main {
    private static final int BACKPACKCAPACITY = 13;

    public static void main(String[] args) {
        System.out.println("Task 1: \n");
        System.out.println(pow(3, 2));
        System.out.println("Task 2: \n");
        Item[] Items = {
                new Item(1, 2),
                new Item(3, 4),
                new Item(4, 5),
                new Item(6, 7),
                new Item(8, 9)};
        Backpack backpack = new Backpack(Items);
        System.out.println(backpack.task_2(Items.length - 1, BACKPACKCAPACITY));
    }

    public static double pow(double a, int b) { // 1
        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }
}
