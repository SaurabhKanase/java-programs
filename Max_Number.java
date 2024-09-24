import java.util.*;
public class Max_Number
{
    public static void main(String[] args)
    {
        int Num1=0 , Num2=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter the first number:");
        Num1 = sc.nextInt();

        System.out.print("\n Enetr the second number:");
        Num2 = sc.nextInt();

        if(Num1 > Num2)
        {
             System.out.print("\n Num1 is grater than Num2");
        }
        else if(Num2 > Num1)
        {
            System.out.print("\n Num2 is grater than Num1");
        }
        else 
        {
            System.out.print("\n Both are equal");
            
        }
    }

}