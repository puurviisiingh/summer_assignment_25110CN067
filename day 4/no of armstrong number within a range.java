import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt(); 
        System.out.println("Enter another number");
        int m=sc.nextInt();
        int n,r,c,s,e;
        int i;
        int k=Math.max(m,a);
        for(i=Math.min(a,m);i<=k;i++)
        {
            n=i;c=0;s=0;e=n;
            while(n>0)
        {
            n/=10;
            c++;
        }
        n=e;
        while(n>0)
        {
            r=n%10;
            n/=10;
            s=s+(int)Math.pow(r,c);
        }
        if(s==e)
            System.out.println("Is armstrong="+i);
        else
            System.out.println("Not armstrong="+i);
        }
        sc.close();
    }
    
}
