package ch.zhaw.iwi.devops.RomanNumeralsKata;

public class Romancalculator {

    public String convert(int i){
        if (i == 10) return "X";
        else if (i == 4) return "IV";
        else return "";
    }
    
}
