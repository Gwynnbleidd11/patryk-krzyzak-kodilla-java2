package additionaltasks;

public class SearchingForMinAndMax {
    public static void main(String[] args) {
        int[] tab = {3,1,5,6,7,9,15,3,4,7,10};
        System.out.println(Calculator.calculateMin(tab));
        System.out.println(Calculator.calculateMax(tab));
    }
}

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
