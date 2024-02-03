public class Task2 {
    public static void main(String[] args) {

        int[] num = {2, 5, 4, 7, 12};


        int sum = 0;
        for (int number : num) {
            sum += number;
        }


        double average = (double) sum / num.length;


        System.out.println(average);
    }
}


