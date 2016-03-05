/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author user
 */
public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h1=4,h2=13,m1=23,m2=54,s1=45,s2=23;
        int sumh,summ,sums,total;
        System.out.println("4點23分45秒到13點54分23秒之間的總秒數");
        sumh=(h2-h1)*60*60;
        summ=(m2-m1)*60;
        sums=s2-s1;
        total=sumh+summ+sums;
        
        System.out.println(total);
       
        int temp=0;
        float average=0;
        int arr[]={3,2,4,5,7,11};
        
        for(int x : arr)
        {
            System.out.print(" "+x);
            temp+=x;
        }
        System.out.println();
        average=(float)temp/arr.length;
        System.out.println(average);
        
        String name;
        int year,month,day;
        Scanner scanner=new Scanner(System.in);
        System.out.println("請輸入姓名:");
        name=scanner.next();
        System.out.println("請輸入生日年 月 日:");
        year=scanner.nextInt();
        month=scanner.nextInt();
        day=scanner.nextInt();
        year-=1911;
        System.out.println(name+"的民國生日為 "+year+" "+month+" "+day);
        
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
             //continue;
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
