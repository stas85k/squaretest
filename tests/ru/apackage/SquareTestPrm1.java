package ru.apackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;


/**
 * @author Stanislav Kuznetsov
 **/
@RunWith(value = Parameterized.class)
public class SquareTestPrm1{

    private double a;
    public SquareTestPrm1(double a) {
        this.a = a;
    }
    @Parameters
    public static Collection<Object[]> data(){
        Object[][]data = new Object[][]{
                {1.0E-17},{1.0E-16},{0.1},{1.0},
                {1 + 1.0E-15},{9 + 1.0E-14},{10.0},{10 + 1.0E-14},
                {15.0},{20 - 1.0E-14},{20.0},{20 + 1.0E-14},
                {25.0},{30 - 1.0E-14},{30.0},{1.0E17},
                {0.0},{-1.0},{-9.0},{-10.0},{-19.0},{-30.0}};

        return Arrays.asList(data);

    }

    /*
    Checking the function that returns the length of the side of the square.
    */
    @Test
    public void test1() {
        Square square = SquareFactory.newSquare(a);
        //assertNotEquals(a, square.sideLength(), 0);
        assertEquals(a, square.sideLength(), 0);
        //System.out.println("t1 sideEx  " + a);
        //System.out.println("t1 sideAc  " + square.sideLength());
    }

    /*
    Checking the function that returns the square of the square.
    */
    @Test
    public void test2() {
        Square square = SquareFactory.newSquare(a);
        System.out.println("t2 squareAc  " + square.square());
        assertEquals(pow(a,2), square.square(), 0);
    }
}
