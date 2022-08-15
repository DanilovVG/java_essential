package book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Title title = new Title();
        Author autor = new Author();
        Content content = new Content();

        //задаем параметры
        System.out.println("Введите название книги:");
        String s1 = in.next();
        title.settitle(s1);
        System.out.println("Введите автора книги:");
        String s2 = in.next();
        System.out.println("Введите содержание книги:");
        String s3 = in.next();
        autor.setautor(s2);
        content.setcontent(s3);

        // выводим объект через метод show()
        title.show();
        autor.show();
        content.show();

    }


}
