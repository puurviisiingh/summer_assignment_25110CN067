import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,n,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.println("reverse of number ="+s);
    }
    
}
