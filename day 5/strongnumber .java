import java.util.Scanner;
public class strongnum {
    static int factorial(int n)
    {
        int s=1;
       for(int i=1;i<=n;i++)
        s=s*i;
       return s;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int m=sc.nextInt();
        int c=m;
        int r,s=0,k;
        while(m>0)
        {
            r=m%10;
            m=m/10;
            k=factorial(r);
            s=s+k;
        }
        if(s==c)
            System.out.println("It is a strong number");
        else
            System.out.println("It is not a strong number");
        sc.close();
    }
    
}
