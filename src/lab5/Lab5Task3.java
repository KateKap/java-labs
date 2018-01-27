package lab5;

import lab4.RectangularTriangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab5Task3 {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void show_test(RectangularTriangle rt) {

        System.out.println("Трикутник:\n" + rt.show());
        System.out.println("Чи може існувати такий прямокутний трикутник: " + rt.is_a_rectangular_triangle());
        System.out.println("Площа трикутника: " + rt.area());
        System.out.println("Периметр трикутника: " + rt.perimeter());
        System.out.println();
    }

    public static Double inputTriangle(String message){
        double result = 0;
        while (true) {
            try {
                System.out.print(message);
                result = Double.valueOf(bufferedReader.readLine());
                if(result>=0) {
                    return result;
                }else{System.out.println("Input positive number!");}
            } catch (Exception e) {
                System.out.println("Input digital number!");
            }
        }
    }


    public static void main(String[] args) {

        double a = inputTriangle("Enter a: ");
        double b = inputTriangle("Enter b: ");
        double c = inputTriangle("Enter c: ");

        RectangularTriangle rt_1 = new RectangularTriangle(a,b,c);

        show_test(rt_1);


    }
}
