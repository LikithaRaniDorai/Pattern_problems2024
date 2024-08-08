import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Right angled triangle
        /*for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for(int i=0;i<=5;i++) {
            for (int j = i+1; j <=5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        int n=5;
        for (int i=1 ;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("1 ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Inverted right angled triangle
        /*for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


        /*Scanner sc =new Scanner(System.in);
        System.out.println("Enter n :");
        int n =sc.nextInt();
        */

        /*for(int i=0;i<2 * n ;i++){
            int totalcolinrow = i>n ? (2*n-i) : i;
            for(int j=0; j< totalcolinrow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

       /* for(int i=0;i< n ;i++){

            for(int j=0; (n/2-i),;j++){
                System.out.print("* ");
            }
            System.out.println();
*/
    }
}