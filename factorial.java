import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) {
         int n , f=1;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextInt();

         for(int i=1 ;i<=n;i++)
         {
             f=f*i;
         }
         System.out.println("the factorial of the number is :"+ f);

         sc.close();
    }
    
}
