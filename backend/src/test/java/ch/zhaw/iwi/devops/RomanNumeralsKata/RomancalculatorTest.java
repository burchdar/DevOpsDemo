package ch.zhaw.iwi.devops.RomanNumeralsKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RomancalculatorTest {

    @Test
    public void test1() {
        Romancalculator number = new Romancalculator();
        assertThat("X").isEqualTo(number.convert(10));         
    }

    @Test
    public void test2() {
        Romancalculator number = new Romancalculator();
        assertThat("IV").isEqualTo(number.convert(4));         
    }

    @Test
    public void test3() {
        Romancalculator number = new Romancalculator();
        assertEquals("I", number.convert(1));
        assertEquals("II", number.convert(2));
        assertEquals("III", number.convert(3));
        assertEquals("IV", number.convert(4));
        assertEquals("V", number.convert(5));
        assertEquals("VI", number.convert(6));
        assertEquals("VII", number.convert(7));
        assertEquals("VIII", number.convert(8));
        assertEquals("IX", number.convert(9));
        assertEquals("X", number.convert(10));       
    }

}

