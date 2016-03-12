package hw2;
import java.util.Scanner;
import java.io.*;


public class HW2
{
    public static void main(String[] args)
	{
		//ex2.3	
        int count=0,year;  
        int mod4,mod100,mod400;
        String temp;
        String arr[]=new String [2000];
        
        System.out.println("請輸入西元的年份:");
        Scanner scanner=new Scanner(System.in);
        year=scanner.nextInt();        
        for (int i=1;i<=year;i++)
        {  
         mod4=i %4;      
         mod100=i %100;
         mod400=i %400;
         if (mod4==0)//閏年
         {
           if (mod100==0)//不是閏年
           {
               if (mod400==0)//閏年
                {
                    count++;
                    temp = "閏年"+ String.valueOf(count)+" : "+ String.valueOf(i);
                    System.out.println(temp);
                    //arr[count]=temp;
                }
                else//不是閏年
                {} 
           }
           else//閏年
           {     
               count++;
               temp="閏年" + String.valueOf(count)+" : "+ String.valueOf(i);
               System.out.println(temp);
               //arr[count]=temp;
           }
         }
      }
	}
}