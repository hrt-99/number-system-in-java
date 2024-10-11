import java.util.*;

public class special 
{
    public static void main(String[] args) {
         int n ,s=0 ,p=1,r=0,t=0;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextInt();
         t=n;

         while(n!=0)
         {
             r=n%10;
             s=s+r;
             p=p*r;
             n=n/10;
         }
         int sum = p+s;

         if(sum==t)
         System.out.println("it is a special number ");
         else
         System.out.println("it is not a special number ");

         sc.close();

    }
    
}
