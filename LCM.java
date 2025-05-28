package TechnichalTraining;
public class LCM{
    public static void main(String args[])
    {
        int a=12, b=24;
        int min=a>b?b:a;
        int GCD=0;
        if(a%min==0 && b%min==0)
        {
             GCD=min;
        }
        else{
            min--;
        }
        int LCM=(a*b)/GCD;
        System.out.println("LCM of a and b is :"+LCM);
    }
}