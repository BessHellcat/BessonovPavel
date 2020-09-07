package ru.mirea.lab1;
import java.lang.*;
public class TestBall {
    public static void main (String [] args) {
        Ball d1 = new Ball ("Green", 158);
        Ball d2 = new Ball ("Red",333);
        Ball d3 = new Ball ("Blue");
        d3.setSize(89);
//System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}