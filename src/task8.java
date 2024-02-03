public class task8 {

        public static void main(String[] args) {
            int[][] ar = {
                    {3, -2, 1},
                    {-1, 4, 6},
                    {2, 5, -8}
            };

            for (int i = 0; i < ar.length; i++) {
                int sum = 0;
                boolean hasNegative = false;
                for (int j = 0; j < ar[i].length; j++) {
                    sum += ar[i][j];
                    if (ar[i][j] < 0) {
                        hasNegative = true;
                    }
                }
                if (hasNegative) {
                    System.out.println( sum);
                }
            }
        }


}
