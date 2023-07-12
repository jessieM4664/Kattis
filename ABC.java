import java.util.*;

class ABC { //
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    int arr[] = new int[3];
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'A') {
        arr[i] = (Math.min(a, (Math.min(b, c))));
      }
      if (str.charAt(i) == 'C') {
        arr[i] = (Math.max(a, (Math.max(b, c))));
      }
      if (str.charAt(i) == 'B') {
        arr[i] = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
      }
      
    }
    
    for (int i = 0; i < str.length(); i++) {
     System.out.print(arr[i] + " ");
    }
    
  }
}
