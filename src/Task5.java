public class Task5 {

        public static void main(String[] args) {
            int[][] ar = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 9},
                    {10, 11, 12, 13}
            };

            for (int i = 0; i < ar.length; i++) {
                int sum = 0;
                for (int j = 0; j < ar[i].length; j++) {
                    sum += ar[i][j];
                }
                System.out.println( (i + 1) + " : " + sum);
            }
        }


}
