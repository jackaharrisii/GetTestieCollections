package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestArrayList {


    ArrayList<String> testArrayList;
    Stack<String> stack;


    @Before
    public void setUp() throws Exception {
        testArrayList = new ArrayList<>();
        testArrayList.add("Cloud");
        testArrayList.add("Tifa");
        testArrayList.add("Yuffie");
        testArrayList.add("Barret");
        testArrayList.add("Aerith");
        stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Goodbye world");
    }

    @Test
    //tests add
    public void TestArrayList1() {
        testArrayList.add("Red 13");
        assertEquals(true, testArrayList.contains("Red 13"));
    }

    @Test
    //tests add with index and get
    public void TestArrayList2() {
        testArrayList.add(1,"Red 13");
        assertEquals("Red 13", testArrayList.get(1));
    }

    @Test
    //tests addAll
    public void TestArrayList3() {
        testArrayList.addAll(stack);
        assertEquals(true, testArrayList.contains("Hello world"));
    }

    @Test
    //tests addAll with index
    public void TestArrayList4() {
        testArrayList.addAll(1, stack);
        assertEquals("Goodbye world", testArrayList.get(2));
    }

    @Test
    //tests clear
    public void TestArrayList5() {
        testArrayList.clear();
        assertEquals(0, testArrayList.size());
    }

    @Test
    //tests indexOf - should return the first index
    public void TestArrayList6() {
        testArrayList.add("Cloud");
        assertEquals(0, testArrayList.indexOf("Cloud"));
    }

    @Test
    //tests lastIndexOf - should return the last index
    public void TestArrayList7() {
        testArrayList.add("Cloud");
        assertEquals(5, testArrayList.lastIndexOf("Cloud"));
    }

    @Test
    //tests isEmpty
    public void TestArrayList8() {
        testArrayList.clear();
        assertEquals(true, testArrayList.isEmpty());
    }

    @Test
    //tests remove by index
    public void TestArrayList9() {
        testArrayList.remove(0);
        assertEquals("Tifa", testArrayList.get(0));
    }

    @Test
    //tests remove by object - should remove the first one only
    public void TestArrayList10() {
        testArrayList.add("Cloud");
        testArrayList.remove("Cloud");
        assertEquals(4, testArrayList.indexOf("Cloud"));
    }

    @Test
    //tests sublist - basically substring for arrays
    public void TestArrayList11() {
        assertEquals(Arrays.asList("Cloud", "Tifa"), testArrayList.subList(0,2));    // returns the true pairing if you played the game right
    }

    @Test
    //returns the correct response when challenged on the previous
    public void TestArrayList12(){
        testArrayList.add(4,"Goodbye");
        assertEquals(Arrays.asList("Goodbye", "Aerith"), testArrayList.subList(4,testArrayList.size()));
    }

    @After
    public void tearDown() throws Exception {
    }

}
