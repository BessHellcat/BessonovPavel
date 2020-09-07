package ru.mirea.lab1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Fantasy", 312);
        Book d2 = new Book("Horror", 545);
        Book d3 = new Book("Comedy");
        d3.setPages(223);
        System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}