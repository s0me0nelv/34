package schoolTests;

import org.junit.Test;

public class Tests {



    @Test

    public void returnZero() {

        System.out.println(Hiker.isNumberInRange(1, 10, 5));

    }

    @Test
    public void returnOne() {

        System.out.println(Hiker.isNumberInRange(10, 1, 5));

    }

    @Test
    public void returnNegative() {

        System.out.println(Hiker.isNumberInRange(1, 10, 100));

    }

    @Test
    public void returnNull() {

        System.out.println(Hiker.isNumberInRange(1, 10, -1));

    }

    @Test
    public void returnNull2() {

        System.out.println(Hiker.isNumberInRange(1, 10, -1));

    }

}
