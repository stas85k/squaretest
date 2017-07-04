package ru.apackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;

import java.util.ArrayList;
import java.util.Collection;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;


/**
 * @author Stanislav Kuznetsov
 **/
@RunWith(Parameterized.class)
public class SquareTestPrm1{
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
           /*create and return a Collection
             of Objects arrays here.
             Each element in each array is
             a parameter to your constructor.
            */
        Object m1[] = new Object[]{1.0E-17};
        Object m2[] = new Object[]{1.0E-16};
        Object m3[] = new Object[]{0.1};
        Object m4[] = new Object[]{1.0};
        Object m5[] = new Object[]{9 + 1.0E-14};
        Object m6[] = new Object[]{10.0};
        Object m7[] = new Object[]{10 + 1.0E-14};
        Object m8[] = new Object[]{1.0};
        Object m9[] = new Object[]{15.0};
        Object m10[] = new Object[]{20 - 1.0E-14};
        Object m11[] = new Object[]{20};
        Object m12[] = new Object[]{20 + 1.0E-14};
        Object m13[] = new Object[]{25};
        Object m14[] = new Object[]{30 - 1.0E-14};
        Object m15[] = new Object[]{30};
        Object m16[] = new Object[]{1.0E17};

        Collection<Object[]> data = new ArrayList<Object[]>();

        data.add(m1);data.add(m2);data.add(m3);data.add(m4);
        data.add(m5);data.add(m6);data.add(m7);data.add(m8);
        data.add(m9);data.add(m10);data.add(m11);data.add(m12);
        data.add(m13);data.add(m14);data.add(m15);data.add(m16);

        return data;

    }
    private double a;
    public SquareTestPrm1(double a) {
        this.a = a;
        //this.b = b;

    }

    @Test    //Проверка возврата длины стороны квадрата.
    public void test1() {
        Square square = SquareFactory.newSquare(a);
        //assertNotEquals(a, square.sideLength(), 0);
        assertEquals(a, square.sideLength(), 0);
        System.out.println("t1 sideEx  " + a);
        System.out.println("t1 sideAc  " + square.sideLength());
    }

    @Test     //Проверка возврата площади квадрата.
    public void test2() {
        Square square = SquareFactory.newSquare(a);
        System.out.println("t2 squareAc  " + square.square());
        assertEquals(pow(a,2), square.square(), 0);
    }
}
