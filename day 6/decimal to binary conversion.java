import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();String b="";int r=0;
        if(n==0)
        {
            b="0";
        }
        else
        {
            while(n>0)
            {
                r=n%2;
                b=r+b;
                n=n/2;
            }
        }
        n=0;
        System.out.println("Decimal to binary ="+b);
        sc.close();
    }
    
}
