package Dates;

import java.text.SimpleDateFormat;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.util.Locale;

public class Getdate
{
    public static String today()
    {
        LocalDate localDate = LocalDate.now();

        String date = String.valueOf(localDate);

        return date;
    }

    
    public static String return_date(int days)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);

        LocalDate localDate = LocalDate.now();

        localDate = LocalDate.now().plusDays(days);

        return String.valueOf(localDate);
    }
    
    
    public static int time_management(String return_day)
   {		
	//Parsing the date
	LocalDate dateBefore = LocalDate.parse(today());
	
        LocalDate dateAfter = LocalDate.parse(return_day);
		
	//calculating number of days in between
	long days = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        
        int days_ = (int)days;
		
	//displaying the number of days
	System.out.println(days);
        
        return days_;       
   }


    public static void main(String args[])
    {
        
        System.out.println(time_management("2021-12-31"));
    }
}

