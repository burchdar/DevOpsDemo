package ch.zhaw.iwi.devops.RomanNumeralsKata;

public class Romancalculator {

    public String convert(int i){
        if (i == 10) return "X";
        else if (i == 9) return "IX";
        else if (i == 8) return "VIII";
        else if (i == 7) return "VII";
        else if (i == 6) return "VI";
        else if (i == 5) return "V";
        else if (i == 4) return "IV";
        else if (i == 3) return "III";
        else if (i == 2) return "II";
        else if (i == 1) return "I";
        else return "Bitte nur Zahlen von 1-10 eingeben";
    }
    
}
