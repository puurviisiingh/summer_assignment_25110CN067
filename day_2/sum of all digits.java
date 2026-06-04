import java.util.Scanner;
public class sumdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,s=0,n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+r;
        }
        System.out.println("sum of digit="+s);
    }
    
}
