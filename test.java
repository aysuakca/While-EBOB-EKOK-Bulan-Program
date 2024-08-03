import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2 = input.nextInt();

       int i = 1;

       while ( i >= 1) {
           i--;
           if ( n1 % i == 0 && n2 % i == 0){
               System.out.println(i);
               break;
           }
       }

        System.out.print("x1 sayisini giriniz : ");
        int x1 = input.nextInt();

        System.out.print("x2 sayisini giriniz : ");
        int x2 = input.nextInt();

       int k =1;

       while (k <= (x1 * x2))  {
           k++;
           if ( k % x1 == 0 && k % x2 == 0){
               System.out.println(k);
               break;
           }

       }
}





