import java.util.Scanner;
public class PerfectNumber {
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; 
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if (isPerfect(n)) {
            System.out.println(n+ " is a perfect number.");
        } else {
            System.out.println(n+ " is not a perfect number.");
        }
        sc.close();
    }
}
