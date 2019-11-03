package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class TestHashSet {
    //HASH SETS ARE BEST USED WHEN YOU WANT A COLLECTION OF OBJECTS, BUT DON'T CARE IN WHAT ORDER THEY ARE ORGANIZED

    HashSet<String> testHashSet;
    HashSet<String> expectedHashSet;

    @Before
    public void setUp() throws Exception {
        testHashSet = new HashSet<>();
        testHashSet.add("Red");
        testHashSet.add("Orange");
        testHashSet.add("Yellow");
        testHashSet.add("Green");
        testHashSet.add("Blue");
        testHashSet.add("Indigo");
        testHashSet.add("Violet");
        expectedHashSet = new HashSet<>(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"));

    }

    @Test
    //testing isEmpty
    public void HashSetTest1(){
        Assert.assertEquals(false,testHashSet.isEmpty());
    }

    @Test
    //test removeAll
    public void HashSetTest2(){
        testHashSet.removeAll(testHashSet);
        Assert.assertEquals(true,testHashSet.isEmpty());
    }

    @Test
    //tests add and contain
    public void HashSetTest3(){
        testHashSet.add("Black");
        Assert.assertEquals(true,testHashSet.contains("Black"));
    }

    @Test
    //tests adding a value already there - shouldn't add anything if already present
    public void HashSetTest4(){
        testHashSet.add("Blue");
        Assert.assertEquals(expectedHashSet, testHashSet);
    }

    @Test
    //tests clear and size
    public void HashSetTest5(){
        testHashSet.clear();
        Assert.assertEquals(0, testHashSet.size());
    }

    @Test
    //tests isEmpty and clear
    public void HashSetTest6(){
        testHashSet.clear();
        Assert.assertEquals(true, testHashSet.isEmpty());
    }

    @Test
    //tests remove
    public void HashSetTest7(){
        testHashSet.remove("Blue");
        Assert.assertEquals(false, testHashSet.contains("Blue"));
    }

}
