package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {
    //BASICALLY, VERY SIMILAR IN FUNCTION TO AN ARRAYLIST
    //ARRAYLISTS ARE NON-SYNCHRONIZED, MEANING THAT MULTIPLE USERS CAN ACCESS SIMULTANEOUSLY AND MAKE CHANGES THAT OTHER USERS MAY NOT SEE
    //VECTORS ARE SYNCHRONIZED, FORCING OTHER USERS TO WAIT UNTIL YOU FINISHED ACCESSING THE LIST SO THAT EVERYONE ALWAYS SEES THE SAME LIST EDITS
    //IN SHORT, ARRAYLISTS ARE FASTER, BUT VECTORS ARE SAFER
    //ARRAYLISTS CAN USE ITERATOR, WHERE VECTORS CAN USE BOTH ITERATOR AND ENUMERATION (ENUMERATION ITERATES WITHOUT THE ABILITY TO REMOVE ELEMENTS)
    //NOTE THAT ARRAYLIST IS PREFERRED UNLESS THERE IS A SPECIFIC REQUIREMENT TO USE VECTOR, EVEN THOUGH THE WORD VECTOR SOUNDS MUCH COOLER
    //https://docs.oracle.com/javase/7/docs/api/java/util/Vector.html

    Vector<String> testVector;
    Stack<String> stack;


    @Before
    public void setUp() throws Exception {
        testVector = new Vector<>();
        testVector.add("Cloud");
        testVector.add("Tifa");
        testVector.add("Yuffie");
        testVector.add("Barret");
        testVector.add("Aerith");
        stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Goodbye world");
    }

    @Test
    //tests add
    public void TestArrayList1() {
        testVector.add("Red 13");
        assertEquals(true, testVector.contains("Red 13"));
    }

    @Test
    //tests add with index and get
    public void TestArrayList2() {
        testVector.add(1,"Red 13");
        assertEquals("Red 13", testVector.get(1));
    }

    @Test
    //tests addAll
    public void TestArrayList3() {
        testVector.addAll(stack);
        assertEquals(true, testVector.contains("Hello world"));
    }

    @Test
    //tests addAll with index
    public void TestArrayList4() {
        testVector.addAll(1, stack);
        assertEquals("Goodbye world", testVector.get(2));
    }

    @Test
    //tests clear
    public void TestArrayList5() {
        testVector.clear();
        assertEquals(0, testVector.size());
    }

    @Test
    //tests indexOf - should return the first index
    public void TestArrayList6() {
        testVector.add("Cloud");
        assertEquals(0, testVector.indexOf("Cloud"));
    }

    @Test
    //tests lastIndexOf - should return the last index
    public void TestArrayList7() {
        testVector.add("Cloud");
        assertEquals(5, testVector.lastIndexOf("Cloud"));
    }

    @Test
    //tests isEmpty
    public void TestArrayList8() {
        testVector.clear();
        assertEquals(true, testVector.isEmpty());
    }

    @Test
    //tests remove by index
    public void TestArrayList9() {
        testVector.remove(0);
        assertEquals("Tifa", testVector.get(0));
    }

    @Test
    //tests remove by object - should remove the first one only
    public void TestArrayList10() {
        testVector.add("Cloud");
        testVector.remove("Cloud");
        assertEquals(4, testVector.indexOf("Cloud"));
    }

    @Test
    //tests sublist - basically substring for arrays
    public void TestArrayList11() {
        assertEquals(Arrays.asList("Cloud", "Tifa"), testVector.subList(0,2));    // returns the true pairing if you played the game right
    }

    @Test
    //returns the correct response when challenged on the previous
    public void TestArrayList12(){
        testVector.add(4,"Goodbye");
        assertEquals(Arrays.asList("Goodbye", "Aerith"), testVector.subList(4, testVector.size()));
    }

}
