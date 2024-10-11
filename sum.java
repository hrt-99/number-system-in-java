import java.util.Scanner;

public class sum 
{
    public static void main(String[] args) {
         int n ,s=0 ,r=0;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number");
         n= sc.nextInt();

         while(n!=0)
         {
             r=n%10;
             s=s+r;
             n=n/10;
         }
         System.out.println("the sum of digits : "+s);

         sc.close();
    }
    
}
