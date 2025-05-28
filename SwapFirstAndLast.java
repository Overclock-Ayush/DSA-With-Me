package TechnichalTraining;

public class SwapFirstAndLast{
    public static void main(String args[])
    {
        int num=98756;
        int lastDigit=num%10;
        int cpy=num;
        int count=0;
        while(cpy!=0)
        {
            cpy=cpy/10;
            count++;

            
        }
        int pow=(int)Math.pow(10,count-1);
        int firstDigit=num/pow;
        num=num/10;
        int pow2=(int)Math.pow(10,count-2);
        int midNum= num=num%pow2;
        lastDigit=lastDigit*pow+(midNum*10)+firstDigit;
        System.out.println(lastDigit);
    }
}