import java.util.*;

class Tests {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.print("h");

        for (int i = 0; i < count*2; i++) {
            System.out.print("e");
        }

        System.out.print("y");

        sc.close();
    }
}
