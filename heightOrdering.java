import java.util.*;

class Tests {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  
  int P = sc.nextInt();

  for (int i = 0; i < P; i++) {
    int xs = sc.nextInt();
    int nums[] = new int[20];
    for (int a = 0; a < 20; a++) {
      nums[a] = sc.nextInt();
    }
    int steps = 0;
    for (int j = 0; j < 20; j++) {
      for (int jj = j+1; jj < nums.length; jj++) {
        if (nums[j] > nums[jj]) {
          int temp = nums[j];
          nums[j] = nums[jj];
          nums[jj] = temp;
          steps++;
        }
      }
    }
    System.out.println(i+1 +  " " + steps);
  }
  
  
}}
