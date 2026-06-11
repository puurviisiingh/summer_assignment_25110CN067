import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,hcf=0;
        System.out.println("Enter 2 numbers");
        m=sc.nextInt();
        n=sc.nextInt();
        int min=Math.min(m,n);
        //int max=Math.max(m,n);
        if(m==n)
            System.out.println("hcf is number itself");
        for(i=1;i<=min;i++)
        {
            if(m%i==0 && n%i==0)
                hcf=i;
        }
        System.out.println("HCF="+hcf);
        sc.close();
    }
    
}
