import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        int n,i,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of natural numbers");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        s=s+i;
    }
    System.out.println("Natural number sum="+s);
    sc.close();
    }
}
