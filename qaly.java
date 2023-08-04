import java.util.*;

class Tests {  // Kattis - Easy : "Quality-Adjusted Life Year" - https://open.kattis.com/problems/qaly
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double output = 0.0;

        for (int i = 0; i < n; i++) {
            double q = sc.nextDouble(); // quality
            double y = sc.nextDouble(); // years
            output = output + (q * y);
        }
        System.out.print(output);
    }
}
