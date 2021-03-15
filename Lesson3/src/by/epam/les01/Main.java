package by.epam.les01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double c = 0;
        double y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        System.out.print("Введите b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        System.out.print("Введите c: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }
        if ((2 * a) != 0 ) {
            y = (b + Math. sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + b;
        } else {
            System.out.println("Знаменатель равен нулю!!");
            y = Double.NaN;
        }
        System.out.println("y=" + y);
    }
}
