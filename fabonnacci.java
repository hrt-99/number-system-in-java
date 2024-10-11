import java.util.Scanner;

public class fabonnacci
 {
    public static void main(String[] args) {
         int n, a=0 ,b=1 ,c=0;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextInt();

         System.out.print(a+" ");
         System.out.print(b+" ");

         c=a+b;
         while(c<=n)
         {
             System.out.print(c+" ");
             a=b;
             b=c;
             c=a+b;
         }

         sc.close();
    }
}
