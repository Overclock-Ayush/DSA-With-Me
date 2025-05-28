package TechnichalTraining;
import java.math.*;

public class PrintDigit {

    public static void main(String args[])
    {
        int num=12345;
        int count=0;
         int cpy=num;
         while(cpy!=0)
         {   count++;
            cpy=cpy/10;
         }
         while(num!=0)
         {
            int pow=(int)Math.pow(10,count-1);
            System.out.println(num/pow);
            num=num%pow;
            count--;

         }
}
}

