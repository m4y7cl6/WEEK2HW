package hw2;
import java.util.Scanner;
import java.io.*;


public class HW2
{
    public static void main(String[] args)
	{
		//ex1.1
        int h1=4,h2=13,m1=23,m2=54,s1=45,s2=23;
        int sumh,summ,sums,total;
        System.out.println("4點23分45秒到13點54分23秒之間的總秒數");
        sumh=(h2-h1)*60*60;
        summ=(m2-m1)*60;
        sums=s2-s1;
        total=sumh+summ+sums;
        System.out.println(total);
	}
}