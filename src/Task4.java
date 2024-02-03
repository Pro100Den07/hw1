public class Task4 {
    public static void main(String[] args) {
        int[][] ar = {
                {3, 8, 1, 5},
                {12, 7, 9, 4},
                {6, 2, 11, 10}
        };

        for (int i = 0; i < ar.length; i++) {
            int min = ar[i][0];
            for (int j = 1; j < ar[i].length; j++) {
                if (ar[i][j] > min) {
                    min = ar[i][j];

                }
                System.out.println((i + 1) + " : " + min);
            }
        }


    }
}