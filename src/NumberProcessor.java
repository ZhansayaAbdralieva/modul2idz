public class NumberProcessor {

    public void printPositiveNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) return;

        for (int n : numbers) {
            if (n > 0) System.out.println(n);
        }
    }


    public int divide(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
}
