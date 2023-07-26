import java.util.*;

class Tests {  // Kattis - Easy : "Jumbo Javelin"
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // test cases
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.print(sum - (N-1));

        sc.close();
    }
}
