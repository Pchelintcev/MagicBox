import java.util.Arrays;
import java.util.Random;

public class Box<T> {
    protected int size; //размер
    protected T[] items;

    public Box(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    Random random = new Random();
    int filled = 0; // занятые ячейки

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;

                filled += 1;
                System.out.println(Arrays.toString(items));
                return true;
            }
        }
        return false;
    }

    public T pick(){
        for (int i = 0; i < items.length; i++){
            if(filled < items.length){
                throw new RuntimeException("свободных ячеек: " + (items.length - filled) + ", их надо заполнить.");
            }
            if (filled == items.length){ //если массив заполнен
                int randomInt = random.nextInt(items.length);
                System.out.println("коробка заполнена.");
                System.out.println("случайный элемент из коробки: " + items[randomInt]);
                System.out.println();
                return items[randomInt];
            }
        }
        return null;
    }
}




