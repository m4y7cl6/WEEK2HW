package hw2;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

public class HW2 {

   public static boolean isValidDate(String sDate) 
   {  
		//ex3.2
      String datePattern1 = "\\d{4}-\\d{2}-\\d{2}";  
      String datePattern2 = "^((\\d{2}(([02468][048])|([13579][26]))" 
              + "[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|" 
              + "(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?" 
              + "((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?(" 
              + "(((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?" 
              + "((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";  
      if ((sDate != null)) {  
          Pattern pattern = Pattern.compile(datePattern1);  
          Matcher match = pattern.matcher(sDate);  
          if (match.matches()) {  
              pattern = Pattern.compile(datePattern2);  
              match = pattern.matcher(sDate);  
              return match.matches();  
          }  
          else {  
              return false;  
          }  
      }  
      return false;  
    }  
    public static void main(String[] args) 
    {
        String Date;
        boolean ANS;
        System.out.println("輸入日期 年-月-日(YYYY-MM-DD):");
        Scanner D=new Scanner(System.in);
        Date = D.nextLine();
        ANS = isValidDate(Date);
        if(ANS==true)
            System.out.println(Date +" 正確");
        else
            System.out.println(Date +" 錯誤");
    }
}