package strings;


public class SimpleTest {
    public static void main(String[] args) {
        String text = "200";
        try {
            text = text.concat(".6");//200.6
            double decimal = Double.parseDouble(text);//200.6(D)
            text = Double.toString(decimal);//200.6 (S)
            int status = (int) Math.floor(Double.valueOf(text).doubleValue());//200
            System.out.println(status);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}

