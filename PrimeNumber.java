package TechnichalTraining;

public class PrimeNumber{
    public static void main(String args[])
    {
        int num=12;
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                isPrime=false;

                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }

    }
}