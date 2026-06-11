import java.util.Scanner;
public class lcf {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int max=Math.max(m,n);
    int lcm=max;
    while(true)
    {
        if(lcm%m==0 && lcm%n==0)
            break;
        else
            lcm++;
    }
    System.out.println("LCM OF 2 GIVEN NUMBERS IS="+lcm);
    sc.close();
    }
}
