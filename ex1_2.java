package hw2;
import java.util.Scanner;
import java.io.*;


public class HW2
{
    public static void main(String[] args)
	{
		//ex1.2
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
	}
}