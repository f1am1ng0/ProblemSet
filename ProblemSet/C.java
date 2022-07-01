import java.util.Arrays;

public class C {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        System.out.println(notContains(array));
    }
    static int notContains(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                return array[i] + 1;
            }
        }
        return 0;
    }
}
