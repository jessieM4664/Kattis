import java.util.*;

class Tests {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  
  while (true) {
  
  int x = sc.nextInt();
  int y = sc.nextInt();
  int z = sc.nextInt(); // hypotenuse
  
  if (x == 0 || y == 0 || z == 0) {
    break;
  } 
  
  if (x > y) {
    int temp = x;
    x = y;
    y = temp;
  }
  if (y > z) {
    int temp = y;
    y = z;
    z = temp;
  }
  
  if (x*x + y*y == z*z) {
    System.out.println("right");
  } else {
    System.out.println("wrong");
  }
  }
}}
