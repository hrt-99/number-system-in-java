import java.util.*;

public class automorphic
 {
    public static void main(String[] args) {
        
          int n , t=0 ,s=0, c=0,ch=0;

          Scanner sc= new Scanner(System.in);
          System.out.println("enter the number ");
          n= sc.nextInt();
           
          t=n;
          s=n*n;

          while (t!=0) {
             c++;
            t=t/10;
           
          }

          ch=(int)(s%(Math.pow(10,c)));

          if(ch==n)
          System.out.println("it is a automorphic number ");
          else
          System.out.println("it is not a automorphic number");

          sc.close();

    }
    
}
