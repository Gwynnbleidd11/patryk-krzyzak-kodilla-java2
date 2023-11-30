package additionaltasks.searchForMinAndMax;

class Calculator {
    public static int calculateMin(int[] table) {
        int min = table[0];
        for (int n = 0; n < table.length; n++) {
            if (table[n] < min) {
                min = table[n];
            }
        }
        return min;
    }

    public static int calculateMax(int[] table) {
        int max = table[0];
        for (int n = 0; n < table.length; n++) {
            if (table[n] > max) {
                max = table[n];
            }
        }
        return max;
    }
}
