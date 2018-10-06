import java.util.*;
 
public class Main
{
    public static void main(String []args)
    {
        int n;
        
        Scanner sc=new Scanner(System.in);
         
        
        n=sc.nextInt();
         
        
        if(n>0)
            System.out.println( " POSITIVE NUMBER");
        else if(n<0)
            System.out.println( " NEGATIVE NUMBER");
        else
            System.out.println("ZERO");
         
    }
}
