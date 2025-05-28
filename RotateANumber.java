package TechnichalTraining;
public class RotateANumber{
    public static void main(String args[])
    {
        int num=12345;
        int rot=8;
        int sum=0;
        int cpy=num;
        int count=0;

        while(cpy!=0)
        {
            cpy=cpy/10;
            count++;
        }
        rot=rot%count;
        int rhs=num%(int)Math.pow(10,rot);
        int lhs=num/(int)Math.pow(10,rot);

        
        
        sum=sum+rhs*(int)Math.pow(10,count-rot);
        sum=sum+lhs;

        System.out.println("Rotated number is :"+sum);

    }
}