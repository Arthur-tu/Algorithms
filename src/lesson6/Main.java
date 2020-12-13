package lesson6;

public class Main {
    public static void main(String[] args) {
        final int min = -100;
        final int max = 100;

        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        int counter = 0;

        for (int i = 0; i < 20; i++) {
            MyTreeMap<Integer, Integer> myTreeMap = new MyTreeMap<>();
            int x = 0;
            while (myTreeMap.height() <= 6) {
                 x = rnd(min,max);
                 myTreeMap.put(x,x);
            }
            if (myTreeMap.isBalanced()) counter++;
        }
        System.out.println(counter);
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}