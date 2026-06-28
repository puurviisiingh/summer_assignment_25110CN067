import java.util.Scanner;
public class recreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=reverse(n,0);
        System.out.println("reccursive sum of digits of a number="+a);
        sc.close();
    }
    static int reverse(int n ,int s)
    {
        if(n==0)
        {
            return s;
        }
        else
        {
            s=(s*10)+(n%10);
            return reverse(n/10, s);
        }
    }
}
