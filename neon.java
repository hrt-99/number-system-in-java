import java.util.Scanner;

public class neon
 {
    public static void main(String[] args) {
        
         int n , s=0 , r=0 ,a=0;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextInt();

         s= n*n;
         while(s!=0)
         {
            r=s%10;
            a= a+r;
            s=s/10;
         }
         
         if(a==n)
         System.out.println("it is a neon number ");
         else
         System.out.println("it is not a neon number ");

         sc.close();

    }
}
