package TechnichalTraining;

public class RotateNum{
    public static void main(String args[])
    {
        int num=12345;
        int rev=0;
        int tmp=0;
        while(num!=0)
        {
            rev=num%10;
            tmp=tmp*10+rev;
            num=num/10;
        }
        System.out.println("Reverse number is :"+tmp);
    }
}