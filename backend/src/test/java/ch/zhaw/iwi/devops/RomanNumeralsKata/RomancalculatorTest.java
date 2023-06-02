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
    
}
