//1
public class Hw6 {
    public void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {

    }

    int[][] ar1 = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18},

    int[] a = {1, 2, 3};{
        print(ar1);
        System.out.println();
        sumRight(ar1);
    }
    public static void sumRight(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i==j)
                    sum+=ar[i][j];

            }

        }
        System.out.println(sum);
    }
}
//3
public static void task2() {
        int Den=5;
        int[] arr={1, 3, 5, 4};
        int[] arr2={11, 3, 5};

         max(arr2);
         max(arr);
}
public static void max(int[] arr){
    int max=0;
    for (int i=0; i< arr.length; i++) {
    }
    System.out.println(max);
}
//4
public static void task3() {
    int Den=5;
    int[] arr={1, 3, 5, 4};
    int[] arr2={11, 3, 5};

    min(arr2);
    min(arr);
}
public static void min(int[] arr){
    int min=0;
    for (int i=0; i< arr.length; i++) {
    }
    System.out.println(min);

}
//5, //6
public static void main(String[] args){
    int[] ar={1, -3, 4};
    int[][] ar1={{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
    task4(ar1);
}
public static void task4(int[][] ar){
        int sum=0;
        for=(int i=0; i<ar.length; i++){
            sum+=ar[i];
        }
        System.out.println(sum);
}
//7
public static void main(String[] args){
    int[][] ar1={{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
    int[] ar={1, -3, 4};
    task5(ar1);
}
public static void task5(int[][] ar1){
    int sum=0;
    for = (int i=0; i<ar1.length; i++){
        sum+=ar1[i];
    }
    System.out.println(sum);
}
//8
public static void main(String[] args){
    int[][] ar1={{1, 2, -3},{4, -5, 6}, {-7, 8, 9}};
    int[] ar={1, -3, 4};
    task6(ar1);
}
public static void task6(int[][] ar1){
    int sum=0;
    for = (int i=0; i<ar1.length; i++){
        sum+=ar1[i];
    }
    System.out.println(sum);
}