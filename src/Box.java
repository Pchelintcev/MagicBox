import java.util.Arrays;
import java.util.Random;

public class Box<T> {
    protected int size; //размер
    protected T[] items;

    public Box(int size) {
        this.size = size;
        items = (T[]) new Object[size]; //что тут не так???
    }

    int filled = 0; //кол-во занятых ячеек

    //TODO метод add - добавление предмета
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled += 1;
                System.out.println(Arrays.toString(items));
                return true;
            }
        }
        System.out.println("для нового элемента в коробке нет места.");
        return false;
    }

    int randomInt; //случайная ячейка в массиве

    //TODO метод pick - выбор (случайного предмета)
    public T pick() {
        Random random = new Random(); //заводим новый объект класса Random
        if (filled < items.length) {
            throw new RuntimeException("свободных ячеек: " + (items.length - filled) + ", их надо заполнить.");
        }
        if (filled == items.length) {
            randomInt = random.nextInt(items.length); //поиск случайной ячейки
            System.out.println("коробка заполнена.");
            System.out.println("случайный элемент из коробки: " + items[randomInt]);
            System.out.println();
            return items[randomInt];
        }
        return null;
    }
}




