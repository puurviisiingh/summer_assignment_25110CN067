import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n,i;
    System.out.println("Enter a number");
    n=sc.nextInt();
    for(i=1;i<=10;i++)
    {
        System.out.println(n+"*"+i+"="+(n*i));
    }
    sc.close();
    }
    
}
