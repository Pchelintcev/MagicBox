public class Box<T> {
    protected int size;
    protected T[] items;

    //TODO конструктор коробок:
    public Box(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    //TODO метод добавления объекта:
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


//TODO проверка на null:

//    for (int i = 0; i < items.length; i++) {
//        if (items[i] == null) {
//            System.out.println("коробка ещё не наполнена, осталось: " + "несколько свободных ячеек.");
//            continue;
//        }
//    }


//        public static int getRandom (T item){
//            Random random = new Random();
//            int randomInt = random.nextInt(items.length) + 1;
//        }

