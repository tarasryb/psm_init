//import org.junit;

class TestLibTest {
    @org.junit.jupiter.api.Test
    void test_calc() {
        TestLib testLib = new TestLib();
        Double testRes = testLib.test_calc(123.45, 678.91);
        Double origValue = 83811.4395;
        // Assert.assertEquals(testRes, origValue);
    }
//?
}