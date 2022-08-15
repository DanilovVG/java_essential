package Adress;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Address adr = new Address();
        System.out.println("Введите Ваш адрес");
        //задаем параметры
        System.out.println("Введите Ваш индекс(цифрами):");
        int s1 = in.nextInt();
        adr.setindex(s1);
        System.out.println("Введите страну:");
        String s2 = in.next();
        adr.setcountry(s2);
        System.out.println("Введите город:");
        String s3 = in.next();
        adr.setcity(s3);
        System.out.println("Введите улицу:");
        String s4 = in.next();
        adr.setstreet(s4);
        System.out.println("Введите № дома(цифрами):");
        int s5 = in.nextInt();
        adr.sethouse(s5);
        System.out.println("Введите № квартиры(цифрами):");
        int s6 = in.nextInt();
        adr.setapartament(s6);

        // выводим в этом месте, чтобы показать применение параметра get
        System.out.println("Вывод адреса:");

        System.out.println("Индекс: " + adr.getindex());
        System.out.println("Страна: " + adr.getcountry());
        System.out.println("Город: " + adr.getcity());
        System.out.println("Улица: " + adr.getstreet());
        System.out.println("Дом: " + adr.gethouse());
        System.out.println("Квартира: " + adr.getapartament());


    }
}
