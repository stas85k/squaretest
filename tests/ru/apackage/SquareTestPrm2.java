package ru.apackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;
import java.util.ArrayList;
import java.util.Collection;
import static junit.framework.TestCase.assertTrue;
import static org.junit.runners.Parameterized.Parameters;

/**
 * @author Stanislav Kuznetsov
 **/
    @RunWith(value = Parameterized.class)
    public class SquareTestPrm2 {
        private double a, b;

        public SquareTestPrm2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Parameters
    public static Collection<Object[]> data() {
        /*
      create and return a Collection of Objects arrays here.
      Each element in each array is a parameter to the constructor.
        */
        Object m0[] = new Object[]{10.0,10.0};
        Object m1[] = new Object[]{20.0,20.0};
        Object m2[] = new Object[]{30.0,30.0};
        Object m3[] = new Object[]{100.1,100.1};
        Object m4[] = new Object[]{0.0,0.0};
        Object m5[] = new Object[]{-1,1};
        Object m6[] = new Object[]{-9,9};
        Object m7[] = new Object[]{-10.0,10.0};
        Object m8[] = new Object[]{-19.0,19};
        Object m9[] = new Object[]{-20.0,20};
        Object m10[] = new Object[]{-25.0,25.0};
        Object m11[] = new Object[]{-30,30};
        Object m12[] = new Object[]{1.0E-18,1.0E-17};
        Object m13[] = new Object[]{1 + 1.0E-16,1 + 1.0E-17};
        Object m14[] = new Object[]{9 + 1.0E-16,9 + 1.0E-17};

        Collection<Object[]> data = new ArrayList<Object[]>();

        data.add(m0);data.add(m1);data.add(m2);data.add(m3);
        data.add(m4);data.add(m5);data.add(m6);data.add(m7);
        data.add(m8);data.add(m9);data.add(m10);data.add(m11);
        data.add(m12);data.add(m13);data.add(m14);

        return data;
    }

    /*
    Checking the function that returns true
    if the square of the two squares are equals
    (false if not)
    */
   @Test
    public void test() {

        Square square0 = SquareFactory.newSquare(a);
        Square square1 = SquareFactory.newSquare(b);
        assertTrue(square0.equalsSquare(square1));
        //assertFalse(square0.equalsSquare(square1));
        System.out.println("sqr1  " + square0.square());
        System.out.println("sqr2  " + square1.square());
        System.out.println("sqrEqu  " + square0.equalsSquare(square1));

    }
}
