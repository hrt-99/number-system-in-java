import java.util.Scanner;

public class pronic
 {
    public static void main(String[] args) {
         int f=0, n;

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number ");
         n=sc.nextInt();

         for(int i =1 ;i<=n;i++)
         {
             if(i*(i+1)==n)
             f++;
            
         }
         if(f==1)
         System.out.println("it is a pronic number ");
         else
         System.out.println("it is not a pronic number ");
         
         sc.close();
    }
    
}
