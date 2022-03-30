public class FibonacciPrime {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;

            if (n1 != 1) {
                for (int j = 1; j <= 10; ++j) {
                    if (n1 % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(n1 + " ");
                }
            }
        }
    }
}

