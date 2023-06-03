package ch.zhaw.iwi.devops.RomanNumeralsKata;

public class Romancalculator {

    public String convert(String i){
        try {
            int num = Integer.parseInt(i);
            if (num == 10) return "X";
            else if (num == 9) return "IX";
            else if (num == 8) return "VIII";
            else if (num == 7) return "VII";
            else if (num == 6) return "VI";
            else if (num == 5) return "V";
            else if (num == 4) return "IV";
            else if (num == 3) return "III";
            else if (num == 2) return "II";
            else if (num == 1) return "I";
            else return "Bitte nur Zahlen von 1-10 eingeben";
        } catch (NumberFormatException e) {
            return "Bitte nur Zahlen eingeben";
        }
    }   
}
