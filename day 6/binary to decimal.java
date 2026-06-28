import java.util.Scanner;
public class binarytodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a numer");
        int n =sc.nextInt();
        int r,i=0;
        double k=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            k=(r*Math.pow(2,i))+k;
            i++;
        }
        System.out.println("Number in decimal="+k);
        sc.close();
    }
    
}
