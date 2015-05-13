import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyCalendar {


	public static void main(String[] args) {
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
//        try {
//	        date = myFormatter.parse("2012-03-1");
//			java.util.Date mydate= myFormatter.parse("2011-03-2");
//			int  day=getDays(date,mydate);
//			int monyh=compareDateInMonths(date,mydate);
//			System.out.println(monyh);
//        } catch (ParseException e) {
//        } 
		
		Calendar cdate = Calendar.getInstance(); // 当前时间
		cdate.set(Calendar.DATE, cdate.get(Calendar.DATE) + 1); // 日期 加1 天
		date = cdate.getTime();
	}
	
	public static int compareDateInMonths(Date fromDate, Date toDate){
		if(fromDate == null || toDate == null)
			throw new IllegalArgumentException("this date must not be null.");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(fromDate);
		c2.setTime(toDate);
		return (c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR))*12 + c1.get(Calendar.MONTH)-c2.get(Calendar.MONTH);
	}
	
	public static int getDays(Date date1, Date date2){     
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		int day=0;
		day=(int) ((date1.getTime()-date2.getTime())/(24*60*60*1000));
      return day;
	}

    /**   
     * 计算两个日期之间相差的月数   
     * @param date1   
     * @param date2   
     * @return   
     */    
    private static int getMonths(Date date1, Date date2){     
        int iMonth = 0;     
        int flag = 0;     
        try{     
            Calendar objCalendarDate1 = Calendar.getInstance();     
            objCalendarDate1.setTime(date1);     
     
            Calendar objCalendarDate2 = Calendar.getInstance();     
            objCalendarDate2.setTime(date2);     
     
            if (objCalendarDate2.equals(objCalendarDate1))     
                return 0;     
            if (objCalendarDate1.after(objCalendarDate2)){     
                Calendar temp = objCalendarDate1;     
                objCalendarDate1 = objCalendarDate2;     
                objCalendarDate2 = temp;     
            }     
            if (objCalendarDate2.get(Calendar.DAY_OF_MONTH) < objCalendarDate1.get(Calendar.DAY_OF_MONTH))     
                flag = 1;     
     
            if (objCalendarDate2.get(Calendar.YEAR) > objCalendarDate1.get(Calendar.YEAR))     
                iMonth = ((objCalendarDate2.get(Calendar.YEAR) - objCalendarDate1.get(Calendar.YEAR))     
                        * 12 + objCalendarDate2.get(Calendar.MONTH) - flag)     
                        - objCalendarDate1.get(Calendar.MONTH);     
            else    
                iMonth = objCalendarDate2.get(Calendar.MONTH)     
                        - objCalendarDate1.get(Calendar.MONTH) - flag;     
     
        } catch (Exception e){     
         e.printStackTrace();     
        }     
        return iMonth;     
    }    
	


}