package lesson5;

public class Backpack {
    Item[] items;

    Backpack(Item[] items) {
        this.items = items;
    }

    int task_2(int index, int weight) {
        if (index < 0) {
            return 0;
        }
        if (items[index].weight > weight) return task_2(index - 1, weight);
         else return Math.max(task_2(index - 1, weight), task_2(index - 1, weight -
                items[index].weight) + items[index].cost);
    }
}
