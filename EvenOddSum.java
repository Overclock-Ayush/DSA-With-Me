package TechnichalTraining;

public class EvenOddSum{
    public static void main(String args[])
    {
        int num=8765;
        int evenSum=0;
        int oddSum=0;
        int pos=0, temp=0;
        while(num!=0)
        {  temp=num%10;
            pos++;
            if(pos%2==0)
            {
                evenSum=evenSum+temp;
            }
            else{
                oddSum=oddSum+temp;
            }
            num=num/10;

        }
        System.out.println("Sum of even index :"+evenSum);
        System.out.println("Sum of odd index :"+oddSum);

    }
}