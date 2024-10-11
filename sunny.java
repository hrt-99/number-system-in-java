import java.util.Scanner;

public class sunny 
{ 
    public static void main(String[] args) {
        
        int n ,i ,s=0,c=0;

        Scanner cs = new Scanner(System.in);
            System.out.println("enter the number ");
            n = cs.nextInt();

            s=n+1;

            for(i=1 ;i<=s;i++)
            {
                 if(i*i==s)
                 c++;
            }
            if(c==1)
            System.out.println("it is a sunny number");
            else
            System.out.println("it is not a sunny number");

            cs.close();

    }
     
    
}
