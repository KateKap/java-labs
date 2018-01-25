package lab5;

import java.util.Scanner;

public class Lab5 {

    public static void Scan(){
        Scanner sc;
        System.out.println("Введіть число:");
        sc = new Scanner(System.in);
        try{
            double x = sc.nextDouble();
            System.out.println(x);
        } catch (Exception e){
            System.out.println("Невірний формат вводу. Дозволено вводити тільки цифри!");
        }
    }

    public static void main(String[] args) {
        Lab5 s = new Lab5();
        s.Scan();
    }
}
