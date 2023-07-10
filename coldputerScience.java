import java.util.Scanner;

class Tests {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  
  int TC = sc.nextInt();
  int count = 0;
  
  for (int i = 0; i < TC; i++) {
    int n = sc.nextInt();
    if (n < 0) {
      count++;
    }
  }
  System.out.print(count);
  
}}
