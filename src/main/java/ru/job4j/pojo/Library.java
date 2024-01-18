package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Базовая версия Java, том I", 561);
        Book book2 = new Book("Эффективная Java", 423);
        Book book3 = new Book("Clean Code", 642);
        Book book4 = new Book("Философия Java", 1024);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        System.out.println();
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " " + books[i].getPages());
            }
        }
    }
}
