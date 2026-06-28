import java.util.Scanner;
public class recsumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=sum(n);
        System.out.println("reccursive sum of digits of a number="+s);
        sc.close();
    }
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n%10 + sum(n/10);
        }
    }
}
