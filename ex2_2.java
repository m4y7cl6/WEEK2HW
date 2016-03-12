package hw2;
import java.util.Scanner;
import java.io.*;


public class HW2
{
    public static void main(String[] args)
	{
		//ex2.2
        float num1,num2,sum=0;
        int op=0;
        System.out.println("請輸入兩個數字:");
        Scanner scanner=new Scanner(System.in);
        num1=scanner.nextFloat();
        num2=scanner.nextFloat();
        while(op<1 || op>=5)
        {
            System.out.println(" 1)+ 2)- 3)* 4)/ :");
            op=scanner.nextInt();
        }
        switch(op) 
        {
            case 1:
                sum=num1+num2;
                break;
            case 2:
                sum=num1-num2;
                break;
            case 3:
                sum=num1*num2;
                break;
            case 4:
                if(num2!=0)
                {
                    sum=num1/num2;
                    break;
                }
                else
                {
                    System.out.println("被除數不能為0");
                    break;
                }
            default:
                break;
        } 
        System.out.println("SUM="+sum);
	}
}