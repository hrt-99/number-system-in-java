import java.util.Scanner;

public class peterson
 {
    public static void main(String[] args) {
        
         int n  ,t=0,s=0 ,r=0 ;

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n =sc.nextInt();

         t= n;
          while(t!=0)
          { int f=1;

              r=t%10;
                 for(int i =1 ;i<=r;i++)
                 {
                    f=f*i;
                 }
                   s=s+f;
              t=t/10;
            }

          if(s==n)
          System.out.println("it is a peterson number");
          else
          System.out.println("it is not  a peterson number ");

          sc.close();

    }
    
}
