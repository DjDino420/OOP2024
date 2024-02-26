public class Main {
    public static int countBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static double mean(double array[]) {
        if (array == null || array.length == 0) {
            return Double.NaN; // return NaN for empty array
        }

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println("1. exercise: INTRODUCTION");
        System.out.println("Bambo Peter Romania");

        System.out.println("2 exercise: PRINT CHARS");
        String name = "Bambo Peter";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.println("2 exercise: PRINT CHARS");
        String longString = "Joe Donald Biden";
        String[] result1 = longString.split(" ");
        for (String s : result1) {
            System.out.println(s);
        }

        System.out.println("3 exercise: PRINT CHARS");
        String s = "apple";
        for (int i = 0; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }

        System.out.println("4 exercise: PRINT CHARS");
        int n = 13;
        System.out.println(countBits(n));

        // Testing mean function
        System.out.println("Testing mean function:");
        double[] numbers = {2.5, 3.5, 4.0, 5.0};
        double result2 = mean(numbers);
        System.out.println("Mean: " + result2);
    }
}
