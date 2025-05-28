package TechnichalTraining;
import java.util.Scanner;

public class PrimeRange {
    public static void main(String args[])
    { int range;
        
        
        System.out.println("Input a range of a number");
        Scanner var=new Scanner(System.in);
        range=var.nextInt();
        for(int k=1;k<=range;k++)
        {  boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(k);i++)
            {
                if(k%i==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime)
            {
                System.out.println(k+" is Prime");
            }
            else{
                System.out.println(k+" is not prime");
            }
        }

    }

}
