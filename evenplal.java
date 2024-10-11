import java.util.Scanner;

public class evenplal
 {
     public static void main(String[] args) {
          int n ,t=0 ,r=0 ;

          Scanner sc= new Scanner(System.in);
          System.out.println("enter the number ");
          n = sc.nextInt();

          t= n;

          while(t!=0)
          {
            r=r*10+t%10;
            t= t/10;
          }
          if(r==n&&n%2==0)
          System.out.println("it is a evenpal number");
          else
          System.out.println("it is not a evenpal number ");

          sc.close();
     }
    
}
