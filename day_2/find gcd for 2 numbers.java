import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,m,n,gcd=0,l=0,u=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter another number");
        m=sc.nextInt();
        if(n>m)
        {
            u=n;
            l=m;
        }
        else if(m>n)
        {
            u=m;
            l=n;
        }
        else
        {
            System.out.println("GCD OF NUMBERS IS NUMBER ITSELF="+m);
            return;
        }
        for(i=1;i<=l;i++)
        {
            if(u%i==0 && l%i==0)
            {
                if(gcd<i)
                    gcd=i;
            }

        }
        System.out.println("GCD for given numbers="+gcd);
    }
}
