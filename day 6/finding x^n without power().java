import java.util.Scanner;
public class pwer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int x=sc.nextInt();
        System.out.println("Enter power");
        int n=sc.nextInt();
        int u=1;
        for(int i=1;i<=x;i++)
            u=x*x;
        System.out.println(u);
        sc.close();
    }
    
}
