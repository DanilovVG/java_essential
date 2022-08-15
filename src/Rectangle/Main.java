package Rectangle;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle shape = new Rectangle();

        //задаем параметры
        System.out.println("Введите сторону 1  прямоугольника:");
        double s1 = in.nextInt();
        shape.setside1(s1);
        System.out.println("Введите сторону 2 прямоугольника:");
        double s2 = in.nextInt();
        shape.setside2(s2);

        // выводим объект через метод
        System.out.println("Площадь и периметр прямоугольника будут:");
        shape.viewRectangle();
    }
}
