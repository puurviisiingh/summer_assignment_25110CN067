import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter number for factorial");
        n=sc.nextInt();
        int s=fac(n);
        System.out.println(" factorial="+s);
        sc.close();
    }
    static int fac(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return(n*fac(n-1));
    }
    
}
