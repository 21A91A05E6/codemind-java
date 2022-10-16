import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        long K, N, A, B;
        while (T > 0) {
            T--;
            N = scanner.nextLong();
            A = scanner.nextLong();
            B = scanner.nextLong();
            K = scanner.nextLong();

            long result = (N / A) + (N / B) - (2 * (N / lcm(A, B)));
            if (result >= K) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }

        }
    }

    public static long lcm(long A, long B) {
        return A * B / gcd(A, B);
    }
    
      static long gcd(long a,long b) {
        return b==0?a:gcd(b,a%b);
    }
}