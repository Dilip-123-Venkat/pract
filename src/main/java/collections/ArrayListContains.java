package collections;

    import java.util.ArrayList;

    public class ArrayListContains {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            list.add("Red");
            list.add("Green");
            list.add("Blue");

            if (list.contains("Green")) {
                System.out.println("Green is in the list!");
            } else {
                System.out.println("Green is not in the list!");
            }
        }
    }


