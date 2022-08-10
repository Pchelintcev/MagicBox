import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //TODO создаем объект класса Box:
        Box box = new Box<Integer>("box1", 5);
        box.add(15);
        box.add(45);
        box.add(4);
        box.add(18);

        System.out.println(Arrays.toString(box.items));

    }
}
