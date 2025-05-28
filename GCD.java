package TechnichalTraining;

public class GCD {
    public static void main(String args[])
    {
        int A=786, B=876;
        int min=A>B ?B:A;
        while(min>0)
        {
            if(A% min==0 && B%min==0)
            {
                System.out.println("GCD is :"+min);
                break;
            }
            else{
                min--;
            }

        }
    }

}
