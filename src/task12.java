public class task12 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean result = isDiagonalsSumEqual(matrix);
        System.out.println( result);
    }

    public static boolean isDiagonalsSumEqual(int[][] matrix) {
        int n = matrix.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - i - 1];
        }

        return leftDiagonalSum == rightDiagonalSum;
    }
}

