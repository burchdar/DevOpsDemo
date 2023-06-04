package ch.zhaw.iwi.devops.RomanNumeralsKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RomancalculatorTest {

    @Test
    public void test1() {
        Romancalculator number = new Romancalculator();
        assertThat("X").isEqualTo(number.convert("10"));         
    }

    @Test
    public void test2() {
        Romancalculator number = new Romancalculator();
        assertThat("IV").isEqualTo(number.convert("4"));         
    }

    @Test
    public void test3() {
        Romancalculator number = new Romancalculator();
        assertEquals("I", number.convert("1"));
        assertEquals("II", number.convert("2"));
        assertEquals("III", number.convert("3"));
        assertEquals("IV", number.convert("4"));
        assertEquals("V", number.convert("5"));
        assertEquals("VI", number.convert("6"));
        assertEquals("VII", number.convert("7"));
        assertEquals("VIII", number.convert("8"));
        assertEquals("IX", number.convert("9"));
        assertEquals("X", number.convert("10"));       
    }
    @Test
    public void test4() {
        Romancalculator number = new Romancalculator();
        assertEquals("Bitte nur Zahlen von 1-1000 eingeben", number.convert("0"));
        assertEquals("Bitte nur Zahlen von 1-1000 eingeben", number.convert("-1"));      
    }

    @Test
    public void test5() {
        Romancalculator number = new Romancalculator();
        assertEquals("Bitte nur Zahlen eingeben", number.convert("a"));
        assertEquals("Bitte nur Zahlen eingeben", number.convert("Fünf"));    
    }

    @Test
    public void test6() {
        Romancalculator number = new Romancalculator();
        assertEquals("XV", number.convert("15"));
        assertEquals("XIX", number.convert("19"));
    }

    @Test
    public void test7() {
        Romancalculator number = new Romancalculator();
        assertEquals("XXXV", number.convert("35"));
        assertEquals("XLIX", number.convert("49"));
    }

    @Test
    public void test8() {
        Romancalculator number = new Romancalculator();
        assertEquals("LV", number.convert("55"));
        assertEquals("XCIX", number.convert("99"));
    }

    @Test
    public void test9() {
        Romancalculator number = new Romancalculator();
        assertEquals("C", number.convert("100"));
        assertEquals("CDXLIX", number.convert("449"));
    }

    @Test
    public void test10() {
        Romancalculator number = new Romancalculator();
        assertEquals("D", number.convert("500"));
        assertEquals("CMXCIX", number.convert("999"));
    }

}

