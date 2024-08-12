package com.Target.genericUtility.seleniumUtility;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class Java_Utility {

	public int getRandomNumber()
	{
		Random random = new Random();
	    int	randomNum=random.nextInt(5000);
		return randomNum;
	}
	public String getSystemDate_YYYYDDMM()
	{
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;
	}
	public String getRequiredDate_YYYYDDMM(int days)
	{
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		
		Calendar cal=sdf.getCalendar();
		
		  cal.add(Calendar.DAY_OF_MONTH,days); 
		String reqDate = sdf.format(cal.getTime());
			return reqDate;
	}
	
}
