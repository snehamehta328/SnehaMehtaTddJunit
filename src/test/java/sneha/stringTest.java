package sneha;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class stringTest {
    stringg s;

    @Before
    public void initiateClass() {
        this.s = new stringg();
    }

    @Test
    public void Test1RemoveA() {
        assertEquals("BCD", s.removeA("ABCD"));
    }

    @Test
    public void Test2RemoveA() {
        assertEquals("BCD", s.removeA("AABCD"));
    }

    @Test
    public void Test3RemoveA() {
        assertEquals("", s.removeA("AA"));
    }

    @Test
    public void Test4RemoveA() {
        assertEquals("", s.removeA("A"));
    }

    @Test
    public void Test5RemoveA() {
        assertEquals("", s.removeA(""));
    }

    @Test
    public void Test6RemoveA() {
        assertEquals("BABA", s.removeA("ABABA"));
    }

    @Test
    public void Test7RemoveA() {
        assertEquals("ABA", s.removeA("AAABA"));
    }

    @Test
    public void Test8RemoveA() {
        assertEquals("BCD", s.removeA("BACD"));
    }

    @Test
    public void Test9RemoveA() {
        assertEquals("BBAA", s.removeA("BBAA"));
    }
}
