import java.util.Scanner;

public class spy {
     public static void main(String[] args) {

         int n , s=0 ,p=1 ,r=0 ;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number");
         n= sc.nextInt();

         while(n!=0)
         {
             r= n%10;
             s= s+r;
             p=p*r;
             n=n/10;
         }

         if(s==p)
         System.out.println("it is a spy number ");
         else
         System.out.println("it is not a spy number ");

         sc.close();
         
     }
}
