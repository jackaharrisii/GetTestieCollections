package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TestTreeMap {

    // TREEMAPS ARE BEST WHEN YOU NEED A MAP, AND YOU WANT IT SORTED IN ORDER BY ITS KEYS (LIKE A PHONE BOOK OR AN ALPHABETIZED MAP)
    //https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html

    TreeMap testTreeMap;

    @Before
    public void setUp() throws Exception {
        testTreeMap = new TreeMap();
        testTreeMap.put("A", "Alpha");
        testTreeMap.put("B", "Bravo");
        testTreeMap.put("C", "Charlie");
        testTreeMap.put("D", "Delta");
        testTreeMap.put("E", "Echo");
        testTreeMap.put("F", "Foxtrot");
        testTreeMap.put("G", "Golf");
        testTreeMap.put("H", "Hotel");
        testTreeMap.put("I", "India");
        testTreeMap.put("J", "Juliet");
        testTreeMap.put("K", "Kilo");
        testTreeMap.put("L", "Lima");
        testTreeMap.put("M", "Mike");
        testTreeMap.put("N", "November");
        testTreeMap.put("O", "Oscar");
        testTreeMap.put("P", "Psoriasis");
        testTreeMap.put("Q", "Quebec");
        testTreeMap.put("R", "Romeo");
        testTreeMap.put("S", "Sierra");
        testTreeMap.put("T", "Tango");
        testTreeMap.put("U", "Uniform");
        testTreeMap.put("V", "Victor");
        testTreeMap.put("W", "Whiskey");
        testTreeMap.put("X", "X-Ray");
        testTreeMap.put("Y", "Yankee");
        testTreeMap.put("Z", "Zulu");
    }

    @Test
    //tests clear and isEmpty
    public void TestLinkedList1() {
        testTreeMap.clear();
        assertEquals(true, testTreeMap.isEmpty());
    }

    @Test
    //tests ceilingKey - gets first instance of given key, or returns null if not found
    public void TestLinkedList2() {
        assertEquals("I", testTreeMap.ceilingKey("I"));
        assertEquals(null,testTreeMap.ceilingKey("i"));
    }

    @Test
    //tests ceilingKey - same as previous, but returns key instead of mapping
    //if no such key, returns null
    public void TestLinkedList3() {
        assertEquals(null, testTreeMap.ceilingKey("i"));
    }

    @Test
    //tests containsKey
    public void TestLinkedList4() {
        assertEquals(true, testTreeMap.containsKey("I"));
    }

    @Test
    //tests containsValue
    public void TestLinkedList5() {
        assertEquals(true, testTreeMap.containsValue("India"));
    }

    @Test
    //tests lastEntry - adds a value that will be sorted to the end by key, then checks if it is in the right spot
    public void TestLinkedList6() {
        testTreeMap.put("ZZZ", "Omega");
        assertEquals("ZZZ", testTreeMap.lastKey());
    }

    @Test
    //tests replace
    public void TestLinkedList7() {
        testTreeMap.replace("P", "Papa");
        assertEquals("Papa", testTreeMap.get("P"));
    }

    @Test
    //tests size
    public void TestLinkedList8() {
        assertEquals(26, testTreeMap.size());
    }

    @After
    public void tearDown() throws Exception {
    }

}
