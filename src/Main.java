public class Main {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>(3);
        Box<Integer> box2 = new Box<>(3);

        box1.add("table");
        box1.add("chair");
        box1.add("wardrobe");
        box1.add("book");
        box1.pick();

        box2.add(15);
        box2.add(45);
//        box2.add(4);
        box2.pick();
    }
}
