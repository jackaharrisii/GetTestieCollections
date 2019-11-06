package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestComparable {
    //COMPARABLE TELLS YOU WHICH ELEMENT IS "MORE" OR "LESS" BY RETURNING A POSITIVE NUMBER, NEGATIVE NUMBER, OR ZERO
    //THIS DOES NOT NECESSARILY MEAN -1, 0, OR +1

    ArrayDeque<String> testArrayDeque;

    @Before
    public void setUp() throws Exception {
        testArrayDeque = new ArrayDeque<>();
        testArrayDeque.add("Cloud");
        testArrayDeque.add("Tifa");
        testArrayDeque.add("Yuffie");
        testArrayDeque.add("Barret");
        testArrayDeque.add("Aerith");
    }

    @Test
    //tests comparator - returns positive number when first element is compared to a second element and found to be "more"
    public void TestComparator1() {
        Assert.assertTrue(testArrayDeque.getFirst().compareTo(testArrayDeque.getLast()) > 0);
    }

    @Test
    //tests comparator - returns zero when elements are equivalent
    public void TestComparator2() {
        Assert.assertTrue(testArrayDeque.getFirst().compareTo("Cloud") == 0);
    }

    @Test
    //tests comparator - returns a negative number when first element is compared to a second element and found to be "less"
    public void TestComparator3() {
        Assert.assertTrue(testArrayDeque.getLast().compareTo("Cloud") < 0);
    }

    @After
    public void tearDown() throws Exception {
    }

}
