import java.util.Scanner; //

class Tests {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  
  int X = sc.nextInt(); // fizz
  int Y = sc.nextInt(); // buzz
  int N = sc.nextInt();
  
  for (int i = 1; i <= N; i++) {
    if (i%X==0 && i%Y==0) {
      System.out.println("FizzBuzz");
    } else if (i%X==0 && i%Y!=0) {
      System.out.println("Fizz");
    } else if (i%X!=0 && i%Y==0) {
      System.out.println("Buzz");
    } else {
      System.out.println(i);
    }
  }
}}
