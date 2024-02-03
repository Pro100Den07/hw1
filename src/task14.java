public class task14 {
    public static void main(String[] args) {
        int[] ar = {5, 8, 3, 12, 4, 7, 10};
        int targetNumber = 7;

        int count = countElementsLessThan(ar, targetNumber);
        System.out.println(targetNumber + ": " + count);
    }

    public static int countElementsLessThan(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num < target) {
                count++;
            }
        }
        return count;
    }
}

