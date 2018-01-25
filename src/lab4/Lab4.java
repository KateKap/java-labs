package lab4;

public class Lab4 {

    public static void show_test(RectangularTriangle rt) {

        System.out.println("Трикутник:\n" + rt.show());
        System.out.println("Чи може існувати такий прямокутний трикутник: " + rt.is_a_rectangular_triangle());
        System.out.println("Площа трикутника: " + rt.area());
        System.out.println("Периметр трикутника: " + rt.perimeter());
        System.out.println();
    }

    public static void main(String[] args) {

        RectangularTriangle rt_1 = new RectangularTriangle(3, 4, 5);
        RectangularTriangle rt_2 = new RectangularTriangle(8, 10, 12);
        RectangularTriangle rt_3 = new RectangularTriangle();
        RectangularTriangle rt_4 = rt_2;

        show_test(rt_1);
        show_test(rt_2);
        show_test(rt_3);
        show_test(rt_4);

    }


}
