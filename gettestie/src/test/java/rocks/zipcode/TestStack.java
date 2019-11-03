package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    Stack<String> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push("Hello world");
    }

    @Test
    //tests push in a stack - should insert an item onto the stack
    public void TestStack1() {
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    //tests pop in a stack - should remove the top object
    public void StackTest2(){
        stack.pop();
        assertEquals(true,stack.isEmpty());

    }
    @Test
    //tests push in a stack - adds an object to the top of the stack
    public void StackTest3(){
        stack.push("Goodbye world");
        assertEquals("Goodbye world",stack.peek());
    }

    @Test
    //tests peek in a stack - returns top object in the stack
    public void StackTest4(){
        assertEquals("Hello world",stack.peek());
    }

    @After
    public void tearDown() throws Exception {
    }

}
