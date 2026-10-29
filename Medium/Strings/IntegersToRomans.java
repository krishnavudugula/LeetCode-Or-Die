//12. Integer to Roman

import java.util.HashMap;

public class IntegersToRomans {
    // public String intToRoman(int num) {
    //     StringBuilder sb = new StringBuilder();
    //     int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //     String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    //     for (int i = 0; i < values.length; i++) {
    //         while (num >= values[i]) {
    //             num -= values[i];
    //             sb.append(symbols[i]);
    //         }
    //     }
    //     return sb.toString();
    // }

     public String intToRoman(int num) {
        HashMap<Integer, String> romans = new HashMap<>();

        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for (int value : values) {
            while (num >= value) {
                result.append(romans.get(value));
                num -= value;
            }
        }

        return result.toString();
    }

}
