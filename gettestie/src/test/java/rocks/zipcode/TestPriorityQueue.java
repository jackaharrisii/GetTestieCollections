package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {

    ArrayDeque<String> testArrayDeque;
    Stack<String> stack;
    PriorityQueue testPriorityQueue;
    String[] testStringArray;

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
        testStringArray = new String[] {"Aerith", "Barret", "Yuffie", "Tifa", "Cloud"};

        // make a Priority Queue from an existing Array Deque
        // the Priority Queue will sort the input Array Deque into Natural Order (ASCIIbetically)
        testPriorityQueue = new PriorityQueue(6);  //set initial capacity to one more than needed (used to test a failed offer)
        testPriorityQueue.addAll(testArrayDeque);               //fill with existing list, rather than piecemeal
    }

    @Test
    //tests size
    public void TestPriorityQueueSize() {
        Assert.assertEquals(5, testPriorityQueue.size());
    }

    @Test
    //tests add and contains
    public void TestPriorityQueueAddAndContains() {
        testPriorityQueue.add(stack.get(0));
        Assert.assertEquals(6, testPriorityQueue.size());    //verifies that an item was added and not replaced
        Assert.assertTrue(testPriorityQueue.contains("Hello world")); //verifies that the item desired was the actual item added
    }

    @Test
    //tests clear
    public void TestPriorityQueueClear() {
        testPriorityQueue.clear();
        Assert.assertEquals(0, testPriorityQueue.size());
    }

    @Test
    //tests offer
    public void TestPriorityQueueOffer() {
        Assert.assertTrue(testPriorityQueue.offer("Red XIII"));  //inserts Red XIII to the Priority Queue and returns true when successful
        Assert.assertTrue(testPriorityQueue.contains("Red XIII"));  //check to see if the Queue contains Red XIII
    }

    @Test
    //tests offer - proof that Priority Queue is not a size limited queue
    //even though java docs says on the Priority Queue page that offer returns false if a size limited queue is full
    public void TestPriorityQueueOffer2(){
        testPriorityQueue.offer("Red XIII");
        Assert.assertTrue(testPriorityQueue.offer("Cait Sith"));

    }

    @Test
    //tests peek - returns the first object in the natural order
    public void TestPriorityQueuePeek(){
        Assert.assertEquals("Aerith", testPriorityQueue.peek());

    }

    @Test
    //tests poll (peek and remove simultaneously)
    public void TestPriorityQueuePoll(){
        Assert.assertEquals("Aerith", testPriorityQueue.poll());   //returns the first element
        Assert.assertFalse(testPriorityQueue.contains("Aerith"));           //checks that the element is no longer in the Queue
    }

    @Test
    //tests remove
    public void TestPriorityQueueremove(){
        testPriorityQueue.remove();                                         //removes the item with the highest priority in the Queue - in this case the first item in the Natural Order
        Assert.assertFalse(testPriorityQueue.contains("Aerith"));           //checks that the element is no longer in the Queue
    }

    @Test
    //tests toArray
    public void TestPriorityQueueToArray(){
        Assert.assertEquals(testStringArray, testPriorityQueue.toArray());
    }

    @After
    public void tearDown() throws Exception {
    }

}
