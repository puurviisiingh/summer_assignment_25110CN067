import java.util.Scanner;
public class palin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s=0,r;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        if(s==n)
            System.out.println("It is a plaindrome number");
        else
            System.out.println("It is not a plaindrome number");
    }
}
