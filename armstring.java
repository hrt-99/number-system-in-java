import java.util.Scanner;

public class armstring 
{ 
    public static void main(String[] args) {
         long n ,c=0 , s=0,s2=0,t=0 ,t1=0;
         int r=0 ;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextLong();

         t=n;
         t1=n;

         while(t!=0)
         {
             t=t/10;
             c++;
         }

         while(t1!=0)
         {
             r=(int)t1%10;
             s= (int)(Math.pow(r,c));
             s2=s2+s;
             t1=t1/10;

         }
         if(n==s2)
         System.out.println("it is armstring nunber");
         else
         System.out.println("it is not a armstring number");


        sc.close();

    }
    
}
