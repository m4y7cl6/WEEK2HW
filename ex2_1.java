package hw2;
import java.util.Scanner;
import java.io.*;


public class HW2
{
    public static void main(String[] args)
	{
		//ex2.1
        String name;
        int year,month,day;
        Scanner scanner=new Scanner(System.in);
        System.out.println("請輸入姓名:");
        name=scanner.next();
        System.out.println("請輸入西元生日年 月 日:");
        year=scanner.nextInt();
        month=scanner.nextInt();
        day=scanner.nextInt();
        year-=1911;
        System.out.println(name+"的民國生日為 "+year+" "+month+" "+day);
	}
}