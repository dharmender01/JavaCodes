

import java.util.Scanner;

class new_test{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     for (int i = 1; i<=n; i++){
         int temp = i;
         for(int j = 1; j<=i; j++){
             char ch = (char)('A'+temp-1);
             temp++;
             System.out.print(ch);
         }
         System.out.println();
     }
    }
}
