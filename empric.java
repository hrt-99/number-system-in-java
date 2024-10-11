import java.util.*;

public class empric
 {
    public static void main(String[] args) {
         int n , r=0,c=0 ,  d=0; 

         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number ");
         n= sc.nextInt();

         for(int i =1 ;i<=n;i++)
          {
             if(n%i==0)
             c++;
          }

          if(c==2)
          { 
             while(n!=0)
             {
                 r= r*10+n%10;
                 n=n/10;
             }
            
            for(int j = 1 ;j<=r;j++)
             {
              if(r%j==0)
                    d++;
              }
            }
           if(c==2&&d==2)
          System.out.println("it is empire number");
          else
          System.out.println("it is not a empire number");

          sc.close();
          
          
          }
    }

