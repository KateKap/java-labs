package lab5;

public class Lab5Task2 {

    public static double findY1 (double endN, double x) {
        double summ = 1;
        double n = -2;
        double sumvalue;
        double xvalue = x;
        double factorialn = 1;
        double fact = 1;
        double Z;

        do {
            try{
            n++;
            Z = (2 * n + 1);
            sumvalue = Z * xvalue / factorialn;
            factorialn *= ++fact;
            xvalue *= x * x;
            summ += sumvalue;
            }
            catch (Exception e){
                System.out.println("Перевірте введені значення!");
            }
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

    public static void main (String[] args) {
        double xa=0.1;
        double xb = 1;
        double dx = (xb-xa)/10;
        double eps = 0.0001;
        double x;
        double n = 10;
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

}
