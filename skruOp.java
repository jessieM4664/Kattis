import java.util.*;

class Tests {  // Kattis - Easy : "Turn It Up"
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int pos = 7;

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            if (str.equals("Skru op!") == true && pos != 10) {
                pos++;
            }
            if (str.equals("Skru ned!") == true && pos != 0) {
                pos--;
            }
        }
        System.out.print(pos);
        sc.close();
    }
}
