package TechnichalTraining;
public class FlipDigit {
public static void main(String args[])
{ int num=32145;
    int sum=0;
    int pos=0;
    while(num!=0)
    { int singleDig=num%10;
        int pow=(int)Math.pow(10,singleDig-1);
        pos++;
        sum=sum+pos*(pow);
        num=num/10;
 }
 System.out.println("Fliped Digits are :"+sum);

}
}
