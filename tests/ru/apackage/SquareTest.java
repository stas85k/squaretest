package ru.apackage;

import org.junit.Test;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * @author Vladimir Bogodukhov
 **/
public class SquareTest {


    @Test    //Проверка возврата длины стороны квадрата.
    public void test1() {
        //double a = 0;
        //double a = MIN_VALUE;
        //double a = 1.0E-17;
        //double a = 1.0E-16;
        //double a = 0.1;
        //double a = 1;
        //double a =  1 + 1.0E-15;
        double a = 9 + 1.0E-15;
        //double a = 10;
        //double a =  10 + 1.0E-14;
        //double a = 15;
        //double a = 20 - 1.0E-14;
        //double a = 20;
        //double a = 20 + 1E-14;
        //double a = 25;
        //double a = 30 - 1.0E-14;
        //double a = 30;
        //double a = 1E17;
        //double a = MAX_VALUE;

        //for (int i = 0; i < 100000; i++) {
        Square square = SquareFactory.newSquare(a);
        //assertNotEquals(a, square.sideLength(), 0);
        assertEquals(a, square.sideLength(), 0);
        System.out.println("t1 sideEx  " + a);
        System.out.println("t1 sideAc  " + square.sideLength());
        //a -= 0.000001;
        //}
    }

    @Test     //Проверка возврата площади квадрата.
    public void test2() {
        //double b = 0;
        //double b = MIN_VALUE;
        //double b = 1.0E-17;
        //double b = 1.0E-16;
        //double b = 0.1;
        //double b = 1;
        //double b =  1 + 1.0E-15;
        //double b = 9;
        double b = -30;
        //double b =  11;
        //double b = 15;
        //double b = 20 - 1.0E-14;
        //double b = 20;
        //double b = 20 + 1E-14;
        //double b = 25;
        //double b = 30 - 1.0E-14;
        //double b = 30;
        //double b = 1E17;
        //double b = MAX_VALUE;
        Square square = SquareFactory.newSquare(b);
        System.out.println("t2 squareAc  " + square.square());
        assertEquals(pow(b,2), square.square(), 0);
    }

    @Test     //Проверка метода, проверяющего равны ли квадраты по площадям.
    public void test3() {
        double c1 = 30;
        double c2 = -30;

        Square square0 = SquareFactory.newSquare(c1);
        Square square1 = SquareFactory.newSquare(c2);
        assertTrue(square0.equalsSquare(square1));
        //assertFalse(square0.equalsSquare(square1));
        System.out.println("t3 sqr1  " + square0.square());
        System.out.println("t3 sqr2  " + square1.square());
        System.out.println("t3 sqrEqu  " + square0.equalsSquare(square1));

    }



}
