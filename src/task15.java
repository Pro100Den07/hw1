

    import java.util.Arrays;

    import java.util.HashSet;

    import java.util.Set;
    public class task15 {


        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            boolean allUnique = areAllElementsUnique(array);
            if (allUnique) {
                System.out.println("all elements");
            } else {
                System.out.println("repetitive element");
            }
        }

        public static boolean areAllElementsUnique(int[] array) {
            Set<Integer> set = new HashSet<>();
            for (int num : array) {
                if (!set.add(num)) {
                    return false;
                }
            }
            return true;
        }
    }

