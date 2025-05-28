package TechnichalTraining;

public class Armstrong{
    public static void main(String args[])
    {
        int num=1634;
        int count=0,sum=0,temp=0;
        int cpy=num;
        int cpy2=num;
        

        while(cpy!=0)
        {
            cpy=cpy/10;
            count++;
        }
        
        while(cpy2!=0)
        { temp=cpy2%10;
            sum=sum+(int)Math.pow(temp,count);
            cpy2=cpy2/10;
            
        }
        if(sum==num)
        {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}