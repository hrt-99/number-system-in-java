import java.util.Scanner;


public class reverse 
{
    public static void main(String[] args) {
    
        int n , r=0 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        n= sc.nextInt();

        while(n!=0)
        {
            r= r*10+n%10;
            n=n/10;

        }
        System.out.println("the reversed number is : "+r);
          
        sc.close();
    }
}
