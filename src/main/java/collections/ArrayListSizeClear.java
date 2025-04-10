package collections;

    import java.util.ArrayList;

    public class ArrayListSizeClear {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            list.add("Dog");
            list.add("Cat");
            list.add("Elephant");

            list.clear();
            System.out.println("ArrayList after clearing: " + list);
        }
    }

