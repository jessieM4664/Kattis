import java.util.*;

class Tests {  // Kattis - Easy : "FYI" - https://open.kattis.com/problems/fyi
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        if (num.charAt(0) == '5' && 
            num.charAt(1) == '5' &&
            num.charAt(2) == '5') {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        sc.close();
    }
}
