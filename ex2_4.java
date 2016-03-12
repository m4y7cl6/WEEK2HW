package hw2;
import java.util.Scanner;
import java.io.*;


public class HW2
{
    public static void main(String[] args)
	{
		//ex2.4
      int n,c,id;
      String arr[][]=new String [100][2]; 
      int grade[]=new int [100]; 
      String temp;
      System.out.println("請輸入欲輸入幾筆資料:");
      Scanner scanner=new Scanner(System.in);
      n=scanner.nextInt();
      Scanner name=new Scanner(System.in);
      for(int i=1;i<=n;i++)
      {
         System.out.println("請輸入學生姓名:");
         arr[i][0]=String.valueOf(i);
         arr[i][1]=name.next();
         System.out.println("請輸入學生成績:");
         try
         {
              grade[i]=Integer.parseInt(scanner.next());  
         }
         catch(NumberFormatException nfe)
         {
             System.out.println("ERROR");
             i--;
         }
      }
      System.out.println("請輸入欲搜尋之學生編號:");
      Scanner getid=new Scanner(System.in);
      id=getid.nextInt();
      c=0;
      for(int i=1;i<=n;i++)
      {
          if(id==Integer.parseInt(arr[i][0]))
          {
              System.out.println("找到編號" +arr[i][0]+ " 姓名: "+arr[i][1] +" 成績 "+grade[i]);
              c=0;
              break;
          }
          else
             c=1;
      }
      if(c==1)
          System.out.println("找不到此編號");
	}
}