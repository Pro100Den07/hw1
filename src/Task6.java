public class Task6 {
    public static void main(String[] args) {
        int[][] ar = {
                {3, -2, 1},
                {-1, 4, 6},
                {2, 5, 8}
        };

        boolean allPositive = true;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i][i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}


