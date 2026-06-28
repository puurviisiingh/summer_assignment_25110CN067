import java.util.Scanner;
public class setbitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(); int c=0;
        while(n>0)
        {
            n=n & (n-1);
            c++;
        }
        System.out.println("set bit count="+c);
        sc.close();
    }
    
}
