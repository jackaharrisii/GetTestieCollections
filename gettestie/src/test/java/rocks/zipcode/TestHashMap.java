package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestHashMap {
    //HASH MAPS ARE BEST WHEN YOU NEED A MAPPING, BUT THE ORDER DOESN'T MATTER

    HashMap testHashMap;

    @Before
    public void setUp() throws Exception {
        testHashMap = new HashMap();
        testHashMap.put("Cloud", "Strife");
        testHashMap.put("Tifa", "Lockheart");
        testHashMap.put("Yuffie", "Kisaragi");
        testHashMap.put("Aerith", "Gainsborough");
        testHashMap.put("Barret", "Wallace");
        testHashMap.put("Vincent", "Valentine");
    }

    @Test
    //tests size
    public void TestHashMap1() {
        assertEquals(6, testHashMap.size());
    }

    @Test
    //tests clear and isEmpty
    public void TestHashMap2() {
        testHashMap.clear();
        assertEquals(true, testHashMap.isEmpty());
    }

    @Test
    //tests containsKey
    public void TestHashMap3() {
        assertEquals(true, testHashMap.containsKey("Cloud"));
    }

    @Test
    //tests containsValue
    public void TestHashMap4() {
        assertEquals(true, testHashMap.containsValue("Strife"));
    }

    @Test
    //tests get
    public void TestHashMap5() {
        assertEquals("Strife", testHashMap.get("Cloud"));
    }

    @Test
    //tests getOrDefault - returns a default value if the key is not found
    public void TestHashMap6() {
        String defaultValue = "no such user";
        assertEquals("no such user", testHashMap.getOrDefault("Tom", defaultValue));
    }

    @Test
    //tests putIfAbsent - this example will not change the map
    public void TestHashMap7() {
        testHashMap.putIfAbsent("Cloud", "Strife");
        assertEquals(6, testHashMap.size());
    }

    @Test
    //tests remove - removes the mapping to key "Cloud", but does not remove the actual key
    public void TestHashMap8() {
        testHashMap.remove("Cloud");
        assertEquals(null, testHashMap.get("Cloud"));
    }

    @After
    public void tearDown() throws Exception {
    }

}
