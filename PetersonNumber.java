package TechnichalTraining;

public class PetersonNumber{
    public static void main(String args[])
    {
        int num=145;
        int cpy=num;
       
        int sum2=0;
        while(num!=0)
        {   int sum1=1;
            int tmp=num%10;
            for(int i=1;i<=tmp;i++)
            {
                sum1=sum1*i;
            }
            
           sum2=sum2+sum1;
            num=num/10;
        }
        if(sum2==cpy)
        {
            System.out.println("Number is Peterson "+sum2);

        }
        else{
            System.out.println("Number is not Peterson "+sum2);
        }
    }
}