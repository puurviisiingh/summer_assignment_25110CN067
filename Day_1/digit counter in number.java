import java.util.Scanner;
public class digitcounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n,r,c=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            c++;
        }
        System.out.println("Number of digits in given number="+c);
        sc.close();
    }
    
}
