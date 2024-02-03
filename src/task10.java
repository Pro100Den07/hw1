public class task10 {

        public static void main(String[] args) {
            int[] ar = {2, -3, 8, -10, 3, 6, -1, 4};

            int evenCount = 0;

            for (int i = 0; i < ar.length; i++) {
                if (ar[i] % 2 == 0) {
                    evenCount++;
                }
            }

            System.out.println("Кількість парних чисел в масиві: " + evenCount);
        }

}
