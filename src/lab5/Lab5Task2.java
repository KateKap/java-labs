package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab5Task2 {

        static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) {

            double xa=readNumber("Enter a: ");
            double xb = readNumber("Enter b: ");
            double k = readPlusNumber("Enter k: ");
            double dx = (xb-xa)/k;
            double eps = 0.0001;
            double x;
            double n = readPlusNumber("Enter n: ");
            double y;
            double Y1;
            double Y2;

            System.out.println("X - параметр;\nY1 - суммы для заданного n;\nY2 - суммы для заданной точности;\nY - точное значение функции;\nпогрешность Y1, погрешность Y2 – относительные погрешности приближенных вычислений.\nn = "+n+"\n");
            for (x = xa; x <= xb; x += dx)
            {
// Использование функции расчета значения с заданным n:
                Y1 = findY1(n,x);
// Использование функции расчета значения с заданной точностью:
                Y2 = findY2(eps,x);
// Расчет условно точного значения:
                y = Math.pow((1+2*x),2)*Math.pow(Math.E,Math.pow(x,2));
                System.out.println(String.format("X = %f; Y1 = %.15f; Y2 = %.15f; Y = %.15f; погрешность Y1 = %.15f; погрешность Y2 = %.15f;", x, Y1, Y2, y, Math.abs((y-Y1)/y), Math.abs((y-Y2)/y)));
            }
        }


        public static double readNumber(String message) {
            double result = 0;
            while (true) {
                try {
                    System.out.print(message);
                    result = Double.valueOf(bufferedReader.readLine());
                        return result;
                } catch (Exception e) {
                    System.out.println("Input digital number!");
                }
            }
        }

    public static double readPlusNumber(String message) {
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



    public static double findY1 (double endN, double x) {
            double summ = 1;
            double n = 0;
            double sumvalue;
            double xvalue = x;
            double factorialn = 1;
            double fact = 1;
            double Z;

            do {
                n++;
                Z = (2 * n + 1);
                sumvalue = Z * xvalue / factorialn;
                factorialn *= ++fact;
                xvalue *= x * x;
                summ += sumvalue;
            } while (n < endN);
            return summ;
        }

    public static double findY2 (double e, double x){
        double summ = 1;
        double sumvalue = 0;
        double xvalue = x;
        double prevx;
        double factorialn = 1;
        double fact = 1;
        double Z;
        double k = 0;

        do {
            k++;
            Z = (2 * k + 1);
            prevx = sumvalue;
            sumvalue = Z * xvalue / factorialn;
            factorialn *= ++fact;
            xvalue *= x * x;
            summ += sumvalue;
        } while (Math.abs(sumvalue - prevx) >= e);
        return summ;
    }

}
