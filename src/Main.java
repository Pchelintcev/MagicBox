import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //TODO создаем объект класса Box:
        Box <Integer> box1 = new Box<>( 5);
        box1.add(15);
        box1.add(45);
        box1.add(4);
        box1.add(18);
        box1.add(1);
        box1.add(2);

        Box <String> box2 = new Box <>(2);
        box2.add("table");

        System.out.println(Arrays.toString(box1.items));
        System.out.println(Arrays.toString(box2.items));
    }
}
