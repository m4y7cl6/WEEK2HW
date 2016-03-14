package hw2;

import java.io.*;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) 
    {
        int Num[] = new int[100];
        double arr[][]=new double [100][2];
        int n,id,angle;
        System.out.println("欲輸入幾個橢圓 ?：");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        Scanner R = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            Num[i+1]=i+1;
            System.out.println("輸入編號橢圓 "+Num[i+1]+" 長邊:");
            arr[i+1][0]=R.nextInt();
            System.out.println("輸入編號橢圓 "+Num[i+1]+" 短邊:");
            arr[i+1][1]=R.nextInt();
        }
        System.out.print("輸入欲搜尋編號：");
        Scanner ID = new Scanner(System.in);
        id = ID.nextInt();
        if(id>n || id<1)
            System.out.println("找不到此編號");
        else
        {
            Oval O = new Oval(arr[id][0],arr[id][1]);
            System.out.println("編號 "+Num[id]+"面積:"+ O.Arc()+ "周長:" + O.Pie());
        }      
    }
}
class Circle
{
    double r;
    int angle;
    Circle(double rr)
    {
       r = rr;
    }
    double Arc(int angle)
    {
       return 3.14 * 2 *r * angle/360;
    }
    double Pie(double angle)
    {
       return 3.14 * r * r* angle/360;
    }      
}
class Oval extends Circle
{
    protected double rb;
        
    public Oval(double a, double b)
    {
        super(a);
        rb = b;
    }
    double Arc()
    {
        return 3.14 * r * rb ;
    }
     double Pie()
    {   
       return Math.sqrt(2*r*2*rb*3.14*3.14 + (2*r-2*rb)*(2*r-2*rb));
    }    
}
