import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int factorial = 1;
        System.out.println("Factorial series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiplies previous factorial by current number
            System.out.print(factorial + " ");
            sc.close();
        }
    }
}
