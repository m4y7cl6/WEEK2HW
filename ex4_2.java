package hw2;
import java.util.Scanner;
import java.io.*;

abstract class Shape 
{
  abstract double area();
}
//圓形
class Circle extends Shape
{
  double r;
  public Circle(double r) 
  { 
    this.r = r; 
  }	
  public double area() 
  {
    return 3.14 * r * r;
  }  
}
//長方形
class Rectangle extends Shape
{
  double width, height;
  public Rectangle(double Rw, double Rh) 
  { 
    this.width = Rw; 
    this.height = Rh;
  }
  public double area() 
  {
    return width*height;
  }  
}
//橢圓形
class Oval extends Shape
{
  double width, height;
  public Oval(double Rw, double Rh) 
  { 
    this.width = Rw; 
    this.height = Rh;
  }
  public double area() 
  {
    return 3.14*width*height;
  }  
}
//三角形
class Triangle extends Shape
{
    double width,height;
    public Triangle(double w,double h)
    {
        this.width = w;
        this.height = h;
    }
    public double area()
    {     
        return width*height/2;
    }
}
public class HW2
{
    public static void main(String[] args)
    {  
	//ex4.2
       char C[] = new char[50];
       double [][]R = new double[50][2];
       int n,op;
       
       System.out.print("請輸入要幾個圖形：");
       Scanner N = new Scanner(System.in);
       n = N.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.print("選擇形狀：1)圓 2)矩 3)三角 4)橢圓 ：");
           Scanner OP = new Scanner(System.in);
           op = OP.nextInt();
           Scanner r = new Scanner(System.in);
           switch(op)
           {
               case 1:
                  C[i] = 'c';
                  System.out.print("圓半徑：");
                  R[i][0] = r.nextDouble();
                  break;
               case 2:
                  C[i] = 'r';
                  System.out.print("矩形長：");
                  R[i][0] = r.nextDouble();
                  System.out.print("矩形寬：");
                  R[i][1] = r.nextDouble();
                  break;
               case 3:
                  C[i] = 't';
                  System.out.print("三角形底：");
                  R[i][0] = r.nextDouble();
                  System.out.print("三角形高：");
                  R[i][1] = r.nextDouble();
                  break;
               case 4:
                  C[i] = 'o';
                  System.out.print("橢圓形短邊：");
                  R[i][0] = r.nextDouble();
                  System.out.print("橢圓形長邊：");
                  R[i][1] = r.nextDouble();
                  break;
               default:
                  System.out.print("ERROR");
                  i--;
                  break;
           }
       }
       for(int i=0;i<n;i++)
       {
           System.out.print("編號" + (i+1)+ " :");
           Shape are;
           if(C[i]=='c')
           {
               System.out.println("圓形");
               are = new Circle(R[i][0]);
               System.out.println("面積:"+are.area());
           }
           else if(C[i]=='r')
           {
               System.out.println("矩形");
               are = new Rectangle(R[i][0],R[i][1]);
               System.out.println("面積:"+are.area());
           }
           else if(C[i]=='o')
           {
               System.out.println("橢圓形");
               are = new Oval(R[i][0],R[i][1]);
               System.out.println("面積:"+are.area());
           }
           else if(C[i]=='t')
           {
               System.out.println("三角形");
               are = new Triangle(R[i][0],R[i][1]);
               System.out.println("面積:"+are.area());
           }      
       }
    }
}