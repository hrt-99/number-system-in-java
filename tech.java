import java.util.Scanner;

public class tech
 {
    public static void main(String[] args) {
         int n ,t=0,c=0 , s=0,h=0 ;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number");
         n= sc.nextInt();

         t=n;
         h=n;

         while(t!=0)
         {
             t=t/10;
             c++;
         }

         int j= (int)(h/(Math.pow(10,c/2)));
         int k= (int)(h%(Math.pow(10,c/2)));

         s= j+k;

         if((s*s)==n)
         System.out.println("it is tech number ");
         else
         System.out.println("it is not a tech number ");

         sc.close();
         
    }
    
}
