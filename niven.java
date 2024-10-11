import java.util.Scanner;

public class niven 
{
    public static void main(String[] args) {
         int n ,a=0 ,r=0,s=0;

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextInt();

          a= n;
          while(a!=0)
         {
             r= a%10;
             s=s+r;
             a=a/10;

         }
         if(n%s==0)
         System.out.println("its is a  niven number");
         else
         System.out.println("it is not a niven number");

         sc.close();
          
    }
    
}
