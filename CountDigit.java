package TechnichalTraining;

public class CountDigit {

    static int countdig(int num)
    {
        int count=0,rev;
        while(num!=0)
        {   count++;
            num=num/10;
            
            
        }
        return count;
    }
    public static void main(String args[])
    {
       int number=123456,res;
       res=countdig(number);
       System.out.println("Number of digits are :"+res);
    }

}
