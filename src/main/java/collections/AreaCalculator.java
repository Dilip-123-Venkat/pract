package collections;

public class AreaCalculator {
    int area(int side){
        return side * side;
    }
    int area(int lenghth, int breadth){
        return lenghth * breadth;
    }
    double area(double raduis){
        return 3.14 * raduis * raduis;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        System.out.println("Area of rectangle:" + obj.area(5,10));
        System.out.println("Area of square: "+ obj.area(5));
        System.out.println("Area of circle: "+ obj.area(7.));
    }
}
