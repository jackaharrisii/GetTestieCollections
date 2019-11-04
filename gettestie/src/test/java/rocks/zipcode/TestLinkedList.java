package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    //KEEPS ALL ELEMENTS IN THE LIST IN THE ORDER RETURNED BY THE COLLECTION'S ITERATOR, I.E., THE ORDER THEY WERE PUT IN THE LIST


    LinkedList testList;

    @Before
    public void setUp() throws Exception {
        testList = new LinkedList();
        testList.add("Alpha");
        testList.add("Bravo");
        testList.add("Charlie");
        testList.add("Delta");
        testList.add("Echo");
    }

    @Test
    //tests add with an index - should be able to add anywhere in the list and move the others over
    //also tests get
    public void TestLinkedList1() {
        testList.add(0, "Zulu");
        assertEquals("Zulu", testList.get(0));
        assertEquals("Echo", testList.get(5));
    }

    @Test
    //tests addFirst - same action, different method
    public void TestLinkedList2() {
        testList.addFirst( "Zulu");
        assertEquals("Zulu", testList.get(0));
        assertEquals("Echo", testList.get(5));
    }

    @Test
    //tests addLast - as advertised
    public void TestLinkedList3() {
        testList.addLast( "Zulu");
        assertEquals("Zulu", testList.get(5));
        assertEquals("Echo", testList.get(4));
    }

    @Test
    //tests clear and size
    public void TestLinkedList4() {
        testList.clear();
        assertEquals(0, testList.size());
    }

    @After
    public void tearDown() throws Exception {
    }

}
