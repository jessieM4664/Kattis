import java.util.*;

class Tests {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(str.charAt(str.length()-1));

        sc.close();
    }
}
