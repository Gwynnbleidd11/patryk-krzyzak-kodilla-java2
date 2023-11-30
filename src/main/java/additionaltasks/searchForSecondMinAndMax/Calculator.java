package additionaltasks.searchForSecondMinAndMax;

public class Calculator {

    public static int calculateSecondMin(int... table) {
        int min = table[0];
        int secondMin = table[0];
        for (int n = 0; n < table.length; n++) {
            if (table[n] < min) {
                min = table[n];
            }
        }
        for (int n = 0; n < table.length; n++) {
            if (table[n] < secondMin && table[n] > min) {
                secondMin = table[n];
            }
        }
        return secondMin;
    }

    public static int calculateSecondMax(int... table) {
        int max = table[0];
        int secondMax = table[0];
        for (int n = 0; n < table.length; n++) {
            if (table[n] > max) {
                max = table[n];
            }
        }
        for (int n = 0; n < table.length; n++) {
            if (table[n] > secondMax && table[n] < max) {
                secondMax = table[n];
            }
        }
        return secondMax;
    }
}
