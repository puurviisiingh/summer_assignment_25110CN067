import java.util.Scanner;
public class largestprimefactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c;
        int p=1,j;
        for(int i=1;i<=n;i++)
        {
            c=0;
            if(n%i==0)
               {
                if(i>=2)
                {
                    for(j=1;j<=n;j++)
                    {
                        if(i%j==0)
                            c++;

                    }
               }
               if(c==2 && p<i)
                p=i;
                }
        }
        System.out.println("Largest prime factor of given number is ="+p);
        sc.close();
    
    }
}
