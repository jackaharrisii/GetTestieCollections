package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestTreeSet {


    // TREEMAPS ARE BEST WHEN YOU NEED A MAP, AND YOU WANT IT SORTED IN ORDER BY ITS KEYS (LIKE A PHONE BOOK OR AN ALPHABETIZED MAP)
    //https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html

    TreeSet<String> testTreeSet;

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
    }

    @Test
    //tests first
    public void TestTreeSet1() {
        assertEquals("Alpha", testTreeSet.first());
    }

    @Test
    //tests clear and is empty
    public void TestTreeSet2() {
        testTreeSet.clear();
        assertEquals(true, testTreeSet.isEmpty());
    }

    @Test
    //tests floor - returns first element <= input
    //this is counter-intuitive to me. floor should return the first item above the floor and ceiling should return the last item below the ceiling
    //this isn't so much the floor as it is the stuff under the floorboards.....
    public void TestTreeSet3() {
        assertEquals("India", testTreeSet.floor("Iz"));
    }

    @Test
    //tests last
    public void TestTreeSet4() {
        assertEquals("Zulu", testTreeSet.last());
    }

    @Test
    //tests pollFirst - returns and removes the first item (there's also a pollLast function)
    public void TestTreeSet5() {
        assertEquals("Alpha", testTreeSet.pollFirst());
        assertEquals("Bravo", testTreeSet.first());
    }

    @Test
    //tests remove - removes if present - returns true if found and false if nothing was removed
    public void TestTreeSet6() {
        assertEquals(true, testTreeSet.remove("Charlie"));
        assertEquals(false, testTreeSet.remove("Omega"));
        assertEquals(false,testTreeSet.contains("Charlie"));
    }

    @Test
    //tests subSet - basically substring, but for sets
    public void TestTreeSet7() {
        TreeSet<String> expectedSubSet = new TreeSet<>();
        expectedSubSet.add("Golf");
        expectedSubSet.add("Hotel");
        expectedSubSet.add("India");
        assertEquals(expectedSubSet, testTreeSet.subSet("Golf", "Juliet"));
    }

}
