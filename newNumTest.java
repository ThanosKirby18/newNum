// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/
 
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*; 
 
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class newNumTest {
 
    @Test
    void num1() {
        String expected = "one";
        String actual = newNum.answer("1");
        assertEquals(expected, actual);
    }
                               
    @Test
    void num9() {
        String expected = "nine";
        String actual = newNum.answer("9");
        assertEquals(expected, actual);
    }
    
    @Test
    void num2() {
        String expected = "two";
        String actual = newNum.answer("2");
        assertEquals(expected, actual);
    }
    @Test
    void num3() {
        String expected = "three";
        String actual = newNum.answer("3");
        assertEquals(expected, actual);
    }
    @Test
    void num4() {
        String expected = "four";
        String actual = newNum.answer("4");
        assertEquals(expected, actual);
    }
    @Test
    void num5() {
        String expected = "five";
        String actual = newNum.answer("5");
        assertEquals(expected, actual);
    }
    @Test
    void num6() {
        String expected = "six";
        String actual = newNum.answer("6");
        assertEquals(expected, actual);
    }
    @Test
    void num10() {
        String expected = "ten";
        String actual = newNum.answer("10");
        assertEquals(expected, actual);
    }
    @Test
    void num17() {
        String expected = "seventeen";
        String actual = newNum.answer("17");
        assertEquals(expected, actual);
    } 
    @Test
    void num11() {
        String expected = "eleven";
        String actual = newNum.answer("11");
        assertEquals(expected, actual);
    } 
    @Test
    void num14() {
        String expected = "fourteen";
        String actual = newNum.answer("14");
        assertEquals(expected, actual);
    }
     @Test
    void num98() {
        String expected = "ninty, eight";
        String actual = newNum.answer("98");
        assertEquals(expected, actual);
    }
    @Test
    void num52() {
        String expected = "fifty, two";
        String actual = newNum.answer("52");
        assertEquals(expected, actual);
    }
    @Test
    void num21() {
        String expected = "twenty, one";
        String actual = newNum.answer("21");
        assertEquals(expected, actual);
    }
    @Test
    void num69() {
        String expected = "sixty, nine";
        String actual = newNum.answer("69");
        assertEquals(expected, actual);
    }
    @Test
    void num31() {
        String expected = "thirty, one";
        String actual = newNum.answer("31");
        assertEquals(expected, actual);
    }
    @Test
    void num40() {
        String expected = "forty, ";
        String actual = newNum.answer("40");
        assertEquals(expected, actual);
    }
    @Test
    void num300() {
        String expected = "three hundred, ";
        String actual = newNum.answer("300");
        assertEquals(expected, actual);
    }    
    @Test
    void num110() {
        String expected = "one hundred, ten";
        String actual = newNum.answer("110");
        assertEquals(expected, actual);
    }    
    @Test
    void num253() {
        String expected = "two hundred, fifty, three";
        String actual = newNum.answer("253");
        assertEquals(expected, actual);
    }    
    @Test
    void num100() {
        String expected = "one hundred, ";
        String actual = newNum.answer("100");
        assertEquals(expected, actual);
    }    
    @Test
    void num341() {
        String expected = "three hundred, forty, one";
        String actual = newNum.answer("341");
        assertEquals(expected, actual);
    }    
    @Test
    void num321() {
        String expected = "three hundred, twenty, one";
        String actual = newNum.answer("321");
        assertEquals(expected, actual);
    }    
    
    /*
    @Test
    void newNumTest() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
    */
}
