import java.util.Random;

public class Box <T> {
    protected String name;
    protected int size;
    protected T [] items;

    //TODO конструктор коробок:
    public Box(String name, int size) {
        this.name = name;
        this.size = size;
        items = (T[]) new Object [size];
    }


//    protected Random random = new Random();
//    int randomInt = random.nextInt(size) + 1;


    //TODO метод заполениня коробки:
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }
}

