import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Box {
    protected String name; //имя коробки
    protected int size; //размер коробки
    protected Box[] cells; //массив с пустыми ячейками в коробке

    protected List items = new ArrayList<>(); //ArrayList - это список на основе массива,
    // позволяет добиться рандомного доступа к элементам по индексу.

    public Box(String name, int size) {
        this.name = name;
        this.size = size;
        this.cells = new Box[size]; //создаём массив с заданным размером
    }

    protected Random random = new Random(); // класс Рандом выдаёт случайное число
    int randomint = random.nextInt(size) + 1; //джава подберёт <int randomint> от 0 до <size> не вкл.(поэтому +1)




    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
}

