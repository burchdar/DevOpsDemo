package ch.zhaw.iwi.devops.RomanNumeralsKata;

public class Romancalculator {

    public String convert(String i){
        try {
            int num = Integer.parseInt(i);
            if (num < 1 || num > 1000) {
                return "Bitte nur Zahlen von 1-1000 eingeben";
            }

            String[] romanCharacters = { "XL","X", "IX", "V", "IV", "I"};
            int[] values = {40,10, 9, 5, 4, 1};

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < values.length; j++) {
                while (num >= values[j]) {
                    sb.append(romanCharacters[j]);
                    num -= values[j];
                }
            }
            return sb.toString();
            } 
            catch (NumberFormatException e) {
                return "Bitte nur Zahlen eingeben";
            }
    }
        
}

