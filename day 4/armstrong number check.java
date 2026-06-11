import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(); 
        int a=n,r,c=0,s=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        n=a;
        while(n>0)
        {
            r=n%10;
            n/=10;
            s=s+(int)Math.pow(r,c);
        }
        if(s==a)
            System.out.println("Is armstrong");
        else
            System.out.println("Not armstrong");
        sc.close();
    }
    
}
