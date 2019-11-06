package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestIterator {



    // ITERATOR ALLOWS YOU TO CHECK IF A LIST HAS A NEXT OBJECT, RETRIEVE THAT OBJECT, OR REMOVE OBJECTS
    //https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
    TreeSet<String> testTreeSet;
    Iterator iteratorTest;
    String testString;

    @Before
    public void setUp() throws Exception {
        testTreeSet = new TreeSet<>();
        //adding the below out of order to demonstrate the point that they will insert in a sorted order
        testTreeSet.add("Zulu");
        testTreeSet.add("Bravo");
        testTreeSet.add("Delta");
        testTreeSet.add("Foxtrot");
        testTreeSet.add("Charlie");
        testTreeSet.add("Golf");
        testTreeSet.add("Whiskey");
        testTreeSet.add("Hotel");
        testTreeSet.add("Juliet");
        testTreeSet.add("Kilo");
        testTreeSet.add("Lima");
        testTreeSet.add("Mike");
        testTreeSet.add("Alpha");
        testTreeSet.add("India");
        testTreeSet.add("November");
        testTreeSet.add("Oscar");
        testTreeSet.add("Psoriasis");
        testTreeSet.add("Sierra");
        testTreeSet.add("Quebec");
        testTreeSet.add("Romeo");
        testTreeSet.add("Echo");
        testTreeSet.add("Tango");
        testTreeSet.add("Uniform");
        testTreeSet.add("Victor");
        testTreeSet.add("X-Ray");
        testTreeSet.add("Yankee");

        iteratorTest = testTreeSet.iterator();
        testString = "";
    }

    @Test
    //tests hasNext and next
    public void TestIterator1() {
        int count = 0;
        while(iteratorTest.hasNext()){
            System.out.println(iteratorTest.next());
            count++;
        }
        assertEquals(26, count);
    }

    @Test
    //tests remove
    public void TestIterator2() {
        int count = 0;
        while (iteratorTest.hasNext()) {
            testString = (String) iteratorTest.next();
            if (testString.equals("November")) {
                iteratorTest.remove();
                count++;
            }
        }
        assertEquals(1,count);
    }
}
