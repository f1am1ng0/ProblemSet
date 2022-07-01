

public class E {
    public static void main(String[] args) {
        System.out.println(countVariants(4));
    }
    static int countVariants(int stearsCount) {
        int[] value = new int[1001];
        value[0] = 0;
        value[1] = 1;
        value[2] = 2;

        for (int i=3; i<=stearsCount; i++) {
            value[i] = value[i-1] + value[i-2];
        }
        return value[stearsCount];
    }
}
