package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {
    //ADD OR REMOVE ITEMS TO EITHER THE FRONT OR BACK OF A LIST (BUT NOT THE MIDDLE...)
    //TECHNICALLY, THERE IS NOTHING YOU CAN DO WITH AN ARRAYDEQUE THAT YOU CAN'T ALREADY DO WITH A LINKED LIST
    //HOWEVER, IT IS FASTER TO PROCESS THAN A LINKED LIST OR STACK WHEN USING AS A QUEUE
    //YOU CAN'T HAVE NULL ELEMENTS IN AN ARRAYDEQUE
    //MAYBE USE THIS TO TRACK A REALLY LONG QUEUE WHERE THE END MIGHT LEAVE DUE TO FRUSTRATION, AS LONG AS NO ONE IN THE MIDDLE LEAVES TOO....
    //https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html

    ArrayDeque<String> testArrayDeque;
    Stack<String> stack;


    @Before
    public void setUp() throws Exception {
        testArrayDeque = new ArrayDeque<>();
        testArrayDeque.add("Cloud");
        testArrayDeque.add("Tifa");
        testArrayDeque.add("Yuffie");
        testArrayDeque.add("Barret");
        testArrayDeque.add("Aerith");
        stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Goodbye world");
    }

    @Test
    //tests add
    public void TestArrayList1() {
        testArrayDeque.add("Red XIII");
        assertEquals(true, testArrayDeque.contains("Red XIII"));
    }

    @Test
    //tests addFirst and getFirst
    public void TestArrayList2() {
        testArrayDeque.addFirst("Red XIII");
        assertEquals("Red XIII", testArrayDeque.getFirst());
    }

    @Test
    //tests addAll
    public void TestArrayList3() {
        testArrayDeque.addAll(stack);
        assertEquals(true, testArrayDeque.contains("Hello world"));
    }
//  LOL, not with an ArrayDeque
//    @Test
//    //tests addAll with index
//    public void TestArrayList4() {
//        testArrayDeque.addAll(1, stack);
//        assertEquals("Goodbye world", testArrayDeque.get(2));
//    }

    @Test
    //tests clear
    public void TestArrayList5() {
        testArrayDeque.clear();
        assertEquals(0, testArrayDeque.size());
    }

    // Nope again - there are no iterable indexes here
//    @Test
//    //tests indexOf - should return the first index
//    public void TestArrayList6() {
//        testArrayDeque.add("Cloud");
//        assertEquals(0, testArrayDeque.indexOf("Cloud"));
//    }
//
//    @Test
//    //tests lastIndexOf - should return the last index
//    public void TestArrayList7() {
//        testArrayDeque.add("Cloud");
//        assertEquals(5, testArrayDeque.lastIndexOf("Cloud"));
//    }

    @Test
    //tests isEmpty
    public void TestArrayList8() {
        testArrayDeque.clear();
        assertEquals(true, testArrayDeque.isEmpty());
    }

    @Test
    //tests pollLast - retrieves and removes the last item (aka - what needs to be done)
    public void TestArrayList11() {
        assertEquals("Aerith", testArrayDeque.pollLast());    // returns Aerith and removes her from the list
        assertEquals(false, testArrayDeque.peekLast().equals("Aerith"));
    }

    @After
    public void tearDown() throws Exception {
    }

}
