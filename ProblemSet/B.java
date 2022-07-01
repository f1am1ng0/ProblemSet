

public class B {
    public static void main(String[] args) {
        System.out.println(minSplit(15));
    }
    static int minSplit(int amount) {
        int[] coins = {1, 5, 10, 20, 50};

        int[] value = new int[1001];

        value[0] = 0;
        for (int i=1; i<=amount; i++){
            value[i] = amount+1;
            for (int j=0; j<coins.length; j++) {
                if (i - coins[j] >= 0){
                    value[i] = Math.min(value[i], value[i-coins[j]]+1);
                }
            }
        }
        return value[amount];
    }
}
