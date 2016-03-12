package HW2;


import java.util.Scanner;
import java.io.*;

public class Circle {
    
    double r;
    int angle;

    double Arc(double r,int angle)
    {
        return 3.14 * r*2 *angle/360;
    }
    double Pie(double r,int angle)
    {
        return 3.14 * r * r *angle/360;
    }
    public static void main(String[] args) {
        double arr[][]=new double [100][2];
        int n,id,a;
        Circle c = new Circle();
        System.out.println("輸入想要幾筆圓面積:");
        Scanner N=new Scanner(System.in);
        n = N.nextInt();
        Scanner R=new Scanner(System.in);
        for(int i=1;i<=n;i++)
        {          
            arr[i][0]=i;
            System.out.println("輸入編號圓"+(int)arr[i][0]+"半徑:");
            arr[i][1]=R.nextInt();
        }
        System.out.println("輸入編號:");
        Scanner ID = new Scanner(System.in);
        id = ID.nextInt();
        
        if(id>n || id<1)
            System.out.println("找不到此編號");
        else
        {
            System.out.println("輸入角度:");
            Scanner A=new Scanner(System.in);
            a = A.nextInt();
            System.out.println("編號"+(int)arr[id][0]+" 弧長:"+c.Arc(arr[id][1],a)+" 面積:"+ c.Pie(arr[id][1],a));
        }      
    }
}